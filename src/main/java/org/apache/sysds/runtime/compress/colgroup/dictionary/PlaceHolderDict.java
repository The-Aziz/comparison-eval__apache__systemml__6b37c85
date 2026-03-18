/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.sysds.runtime.compress.colgroup.dictionary;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;

import org.apache.sysds.runtime.io.IOUtilFunctions;

public class PlaceHolderDict extends UnsupportedDictionary implements Serializable {

	private static final long serialVersionUID = 9176356558592L;

	private static final String errMessage = "PlaceHolderDict does not support Operations, and is purely intended for serialization";

	/** The number of values supposed to be contained in this dictionary */
	private final int nVal;

	public PlaceHolderDict(int nVal) {
		this.nVal = nVal;
	}

	@Override
	protected String getErrorMessage() {
		return errMessage;
	}

	@Override
	public long getInMemorySize() {
		return 16 + 4;
	}

	@Override
	public void write(DataOutput out) throws IOException {
		byte[] o = new byte[5];
		o[0] = (byte) DictionaryFactory.Type.PLACE_HOLDER.ordinal();
		IOUtilFunctions.intToBa(nVal, o, 1);
		out.write(o);
	}

	public static PlaceHolderDict read(DataInput in) throws IOException {
		int nVals = in.readInt();
		return new PlaceHolderDict(nVals);
	}

	@Override
	public long getExactSizeOnDisk() {
		return 1 + 4;
	}

	@Override
	public int getNumberOfValues(int nCol) {
		return nVal;
	}

	@Override
	public String getString(int colIndexes) {
		return ""; // get string empty
	}

	@Override
	public long getNumberNonZeros(int[] counts, int nCol) {
		return -1;
	}

	@Override
	public IDictionary clone() {
		return new PlaceHolderDict(nVal);
	}
}
