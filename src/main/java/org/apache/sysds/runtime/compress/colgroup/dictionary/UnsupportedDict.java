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

import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;

import org.apache.sysds.runtime.compress.colgroup.indexes.IColIndex;
import org.apache.sysds.runtime.data.DenseBlock;
import org.apache.sysds.runtime.data.SparseBlock;
import org.apache.sysds.runtime.functionobjects.Builtin;
import org.apache.sysds.runtime.functionobjects.ValueFunction;
import org.apache.sysds.runtime.instructions.cp.CM_COV_Object;
import org.apache.sysds.runtime.matrix.data.MatrixBlock;
import org.apache.sysds.runtime.matrix.operators.BinaryOperator;
import org.apache.sysds.runtime.matrix.operators.ScalarOperator;
import org.apache.sysds.runtime.matrix.operators.UnaryOperator;

public class UnsupportedDict implements IDictionary, Serializable {

	private static final long serialVersionUID = 9176356558592L;

	private static void throwEx() {
		throw new RuntimeException("Dictionary does not support Operations");
	}

	@Override
	public double[] getValues() {
		throwEx();
		return null;
	}

	@Override
	public double getValue(int i) {
		throwEx();
		return 0;
	}

	@Override
	public double getValue(int r, int col, int nCol) {
		throwEx();
		return 0;
	}

	@Override
	public long getInMemorySize() {
		throwEx();
		return 0;
	}

	@Override
	public double aggregate(double init, Builtin fn) {
		throwEx();
		return 0;
	}

	@Override
	public double aggregateWithReference(double init, Builtin fn, double[] reference, boolean def) {
		throwEx();
		return 0;
	}

	@Override
	public double[] aggregateRows(Builtin fn, int nCol) {
		throwEx();
		return null;
	}

	@Override
	public double[] aggregateRowsWithDefault(Builtin fn, double[] defaultTuple) {
		throwEx();
		return null;
	}

	@Override
	public double[] aggregateRowsWithReference(Builtin fn, double[] reference) {
		throwEx();
		return null;
	}

	@Override
	public void aggregateCols(double[] c, Builtin fn, IColIndex colIndexes) {
		throwEx();
	}

	@Override
	public void aggregateColsWithReference(double[] c, Builtin fn, IColIndex colIndexes, double[] reference,
		boolean def) {
		throwEx();
	}

	@Override
	public IDictionary applyScalarOp(ScalarOperator op) {
		throwEx();
		return null;
	}

	@Override
	public IDictionary applyScalarOpAndAppend(ScalarOperator op, double v0, int nCol) {
		throwEx();
		return null;
	}

	@Override
	public IDictionary applyUnaryOp(UnaryOperator op) {
		throwEx();
		return null;
	}

	@Override
	public IDictionary applyUnaryOpAndAppend(UnaryOperator op, double v0, int nCol) {
		throwEx();
		return null;
	}

	@Override
	public IDictionary applyScalarOpWithReference(ScalarOperator op, double[] reference, double[] newReference) {
		throwEx();
		return null;
	}

	@Override
	public IDictionary applyUnaryOpWithReference(UnaryOperator op, double[] reference, double[] newReference) {
		throwEx();
		return null;
	}

	@Override
	public IDictionary binOpLeft(BinaryOperator op, double[] v, IColIndex colIndexes) {
		throwEx();
		return null;
	}

	@Override
	public IDictionary binOpLeftAndAppend(BinaryOperator op, double[] v, IColIndex colIndexes) {
		throwEx();
		return null;
	}

	@Override
	public IDictionary binOpLeftWithReference(BinaryOperator op, double[] v, IColIndex colIndexes, double[] reference,
		double[] newReference) {
		throwEx();
		return null;
	}

	@Override
	public IDictionary binOpRight(BinaryOperator op, double[] v, IColIndex colIndexes) {
		throwEx();
		return null;
	}

	@Override
	public IDictionary binOpRightAndAppend(BinaryOperator op, double[] v, IColIndex colIndexes) {
		throwEx();
		return null;
	}

	@Override
	public IDictionary binOpRight(BinaryOperator op, double[] v) {
		throwEx();
		return null;
	}

	@Override
	public IDictionary binOpRightWithReference(BinaryOperator op, double[] v, IColIndex colIndexes, double[] reference,
		double[] newReference) {
		throwEx();
		return null;
	}

	@Override
	public IDictionary clone() {
		throwEx();
		return null;
	}

	@Override
	public void write(DataOutput out) throws IOException {
		throwEx();
	}

	@Override
	public long getExactSizeOnDisk() {
		throwEx();
		return 0;
	}

	@Override
	public DictType getDictType() {
		throwEx();
		return null;
	}

	@Override
	public int getNumberOfValues(int ncol) {
		throwEx();
		return 0;
	}

	@Override
	public double[] sumAllRowsToDouble(int nrColumns) {
		throwEx();
		return null;
	}

	@Override
	public double[] sumAllRowsToDoubleWithDefault(double[] defaultTuple) {
		throwEx();
		return null;
	}

	@Override
	public double[] sumAllRowsToDoubleWithReference(double[] reference) {
		throwEx();
		return null;
	}

	@Override
	public double[] sumAllRowsToDoubleSq(int nrColumns) {
		throwEx();
		return null;
	}

	@Override
	public double[] sumAllRowsToDoubleSqWithDefault(double[] defaultTuple) {
		throwEx();
		return null;
	}

	@Override
	public double[] sumAllRowsToDoubleSqWithReference(double[] reference) {
		throwEx();
		return null;
	}

	@Override
	public double[] productAllRowsToDouble(int nrColumns) {
		throwEx();
		return null;
	}

	@Override
	public double[] productAllRowsToDoubleWithDefault(double[] defaultTuple) {
		throwEx();
		return null;
	}

	@Override
	public double[] productAllRowsToDoubleWithReference(double[] reference) {
		throwEx();
		return null;
	}

	@Override
	public void colSum(double[] c, int[] counts, IColIndex colIndexes) {
		throwEx();
	}

	@Override
	public void colSumSq(double[] c, int[] counts, IColIndex colIndexes) {
		throwEx();
	}

	@Override
	public void colSumSqWithReference(double[] c, int[] counts, IColIndex colIndexes, double[] reference) {
		throwEx();
	}

	@Override
	public double sum(int[] counts, int nCol) {
		throwEx();
		return 0;
	}

	@Override
	public double sumSq(int[] counts, int nCol) {
		throwEx();
		return 0;
	}

	@Override
	public double sumSqWithReference(int[] counts, double[] reference) {
		throwEx();
		return 0;
	}

	@Override
	public String getString(int colIndexes) {
		throwEx();
		return null;
	}

	@Override
	public IDictionary sliceOutColumnRange(int idxStart, int idxEnd, int previousNumberOfColumns) {
		throwEx();
		return null;
	}

	@Override
	public boolean containsValue(double pattern) {
		throwEx();
		return false;
	}

	@Override
	public boolean containsValueWithReference(double pattern, double[] reference) {
		throwEx();
		return false;
	}

	@Override
	public long getNumberNonZeros(int[] counts, int nCol) {
		throwEx();
		return 0;
	}

	@Override
	public long getNumberNonZerosWithReference(int[] counts, double[] reference, int nRows) {
		throwEx();
		return 0;
	}

	@Override
	public void addToEntry(double[] v, int fr, int to, int nCol) {
		throwEx();
	}

	@Override
	public void addToEntry(double[] v, int fr, int to, int nCol, int rep) {
		throwEx();
	}

	@Override
	public void addToEntryVectorized(double[] v, int f1, int f2, int f3, int f4, int f5, int f6, int f7, int f8, int t1,
		int t2, int t3, int t4, int t5, int t6, int t7, int t8, int nCol) {
		throwEx();
	}

	@Override
	public IDictionary subtractTuple(double[] tuple) {
		throwEx();
		return null;
	}

	@Override
	public MatrixBlockDictionary getMBDict(int nCol) {
		throwEx();
		return null;
	}

	@Override
	public IDictionary scaleTuples(int[] scaling, int nCol) {
		throwEx();
		return null;
	}

	@Override
	public IDictionary preaggValuesFromDense(int numVals, IColIndex colIndexes, IColIndex aggregateColumns, double[] b,
		int cut) {
		throwEx();
		return null;
	}

	@Override
	public IDictionary replace(double pattern, double replace, int nCol) {
		throwEx();
		return null;
	}

	@Override
	public IDictionary replaceWithReference(double pattern, double replace, double[] reference) {
		throwEx();
		return null;
	}

	@Override
	public void product(double[] ret, int[] counts, int nCol) {
		throwEx();
	}

	@Override
	public void productWithDefault(double[] ret, int[] counts, double[] def, int defCount) {
		throwEx();
	}

	@Override
	public void productWithReference(double[] ret, int[] counts, double[] reference, int refCount) {
		throwEx();
	}

	@Override
	public void colProduct(double[] res, int[] counts, IColIndex colIndexes) {
		throwEx();
	}

	@Override
	public void colProductWithReference(double[] res, int[] counts, IColIndex colIndexes, double[] reference) {
		throwEx();
	}

	@Override
	public CM_COV_Object centralMoment(ValueFunction fn, int[] counts, int nRows) {
		throwEx();
		return null;
	}

	@Override
	public CM_COV_Object centralMoment(CM_COV_Object ret, ValueFunction fn, int[] counts, int nRows) {
		throwEx();
		return null;
	}

	@Override
	public CM_COV_Object centralMomentWithDefault(ValueFunction fn, int[] counts, double def, int nRows) {
		throwEx();
		return null;
	}

	@Override
	public CM_COV_Object centralMomentWithDefault(CM_COV_Object ret, ValueFunction fn, int[] counts, double def,
		int nRows) {
		throwEx();
		return null;
	}

	@Override
	public CM_COV_Object centralMomentWithReference(ValueFunction fn, int[] counts, double reference, int nRows) {
		throwEx();
		return null;
	}

	@Override
	public CM_COV_Object centralMomentWithReference(CM_COV_Object ret, ValueFunction fn, int[] counts, double reference,
		int nRows) {
		throwEx();
		return null;
	}

	@Override
	public IDictionary rexpandCols(int max, boolean ignore, boolean cast, int nCol) {
		throwEx();
		return null;
	}

	@Override
	public IDictionary rexpandColsWithReference(int max, boolean ignore, boolean cast, int reference) {
		throwEx();
		return null;
	}

	@Override
	public double getSparsity() {
		throwEx();
		return 0;
	}

	@Override
	public void multiplyScalar(double v, double[] ret, int off, int dictIdx, IColIndex cols) {
		throwEx();
	}

	@Override
	public void TSMMWithScaling(int[] counts, IColIndex rows, IColIndex cols, MatrixBlock ret) {
		throwEx();
	}

	@Override
	public void MMDict(IDictionary right, IColIndex rowsLeft, IColIndex colsRight, MatrixBlock result) {
		throwEx();
	}

	@Override
	public void MMDictScaling(IDictionary right, IColIndex rowsLeft, IColIndex colsRight, MatrixBlock result,
		int[] scaling) {
		throwEx();
	}

	@Override
	public void MMDictDense(double[] left, IColIndex rowsLeft, IColIndex colsRight, MatrixBlock result) {
		throwEx();
	}

	@Override
	public void MMDictScalingDense(double[] left, IColIndex rowsLeft, IColIndex colsRight, MatrixBlock result,
		int[] scaling) {
		throwEx();
	}

	@Override
	public void MMDictSparse(SparseBlock left, IColIndex rowsLeft, IColIndex colsRight, MatrixBlock result) {
		throwEx();
	}

	@Override
	public void MMDictScalingSparse(SparseBlock left, IColIndex rowsLeft, IColIndex colsRight, MatrixBlock result,
		int[] scaling) {
		throwEx();
	}

	@Override
	public void TSMMToUpperTriangle(IDictionary right, IColIndex rowsLeft, IColIndex colsRight, MatrixBlock result) {
		throwEx();
	}

	@Override
	public void TSMMToUpperTriangleDense(double[] left, IColIndex rowsLeft, IColIndex colsRight, MatrixBlock result) {
		throwEx();
	}

	@Override
	public void TSMMToUpperTriangleSparse(SparseBlock left, IColIndex rowsLeft, IColIndex colsRight,
		MatrixBlock result) {
		throwEx();
	}

	@Override
	public void TSMMToUpperTriangleScaling(IDictionary right, IColIndex rowsLeft, IColIndex colsRight, int[] scale,
		MatrixBlock result) {
		throwEx();
	}

	@Override
	public void TSMMToUpperTriangleDenseScaling(double[] left, IColIndex rowsLeft, IColIndex colsRight, int[] scale,
		MatrixBlock result) {
		throwEx();
	}

	@Override
	public void TSMMToUpperTriangleSparseScaling(SparseBlock left, IColIndex rowsLeft, IColIndex colsRight, int[] scale,
		MatrixBlock result) {
		throwEx();
	}

	@Override
	public IDictionary cbind(IDictionary that, int nCol) {
		throwEx();
		return null;
	}

	@Override
	public boolean equals(IDictionary o) {
		throwEx();
		return false;
	}

	@Override
	public boolean equals(double[] v) {
		throwEx();
		return false;
	}

	@Override
	public IDictionary reorder(int[] reorder) {
		throwEx();
		return null;
	}

	@Override
	public IDictionary rightMMPreAggSparse(int numVals, SparseBlock b, IColIndex thisCols, IColIndex aggregateColumns,
		int nColRight) {
		throwEx();
		return null;
	}

	@Override
	public void putSparse(SparseBlock sb, int idx, int rowOut, int nCol, IColIndex columns) {
		throwEx();
	}

	@Override
	public void putDense(DenseBlock db, int idx, int rowOut, int nCol, IColIndex columns) {
		throwEx();
	}

	@Override
	public IDictionary append(double[] row) {
		throwEx();
		return null;
	}

	@Override
	public double[] getRow(int i, int nCol) {
		throwEx();
		return null;
	}

	@Override
	public int[] countNNZZeroColumns(int[] counts) {
		throwEx();
		return null;
	}

}
