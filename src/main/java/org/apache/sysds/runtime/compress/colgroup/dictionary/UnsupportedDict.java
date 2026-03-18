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

	private static final long serialVersionUID = 1L;

	@Override
	public double[] getValues() {
		throw throwEx();
	}

	@Override
	public double getValue(int i) {
		throw throwEx();
	}

	@Override
	public double getValue(int r, int col, int nCol) {
		throw throwEx();
	}

	@Override
	public long getInMemorySize() {
		throw throwEx();
	}

	@Override
	public double aggregate(double init, Builtin fn) {
		throw throwEx();
	}

	@Override
	public double aggregateWithReference(double init, Builtin fn, double[] reference, boolean def) {
		throw throwEx();
	}

	@Override
	public double[] aggregateRows(Builtin fn, int nCol) {
		throw throwEx();
	}

	@Override
	public double[] aggregateRowsWithDefault(Builtin fn, double[] defaultTuple) {
		throw throwEx();
	}

	@Override
	public double[] aggregateRowsWithReference(Builtin fn, double[] reference) {
		throw throwEx();
	}

	@Override
	public void aggregateCols(double[] c, Builtin fn, IColIndex colIndexes) {
		throw throwEx();
	}

	@Override
	public void aggregateColsWithReference(double[] c, Builtin fn, IColIndex colIndexes, double[] reference,
		boolean def) {
		throw throwEx();
	}

	@Override
	public IDictionary applyScalarOp(ScalarOperator op) {
		throw throwEx();
	}

	@Override
	public IDictionary applyScalarOpAndAppend(ScalarOperator op, double v0, int nCol) {
		throw throwEx();
	}

	@Override
	public IDictionary applyUnaryOp(UnaryOperator op) {
		throw throwEx();
	}

	@Override
	public IDictionary applyUnaryOpAndAppend(UnaryOperator op, double v0, int nCol) {
		throw throwEx();
	}

	@Override
	public IDictionary applyScalarOpWithReference(ScalarOperator op, double[] reference, double[] newReference) {
		throw throwEx();
	}

	@Override
	public IDictionary applyUnaryOpWithReference(UnaryOperator op, double[] reference, double[] newReference) {
		throw throwEx();
	}

	@Override
	public IDictionary binOpLeft(BinaryOperator op, double[] v, IColIndex colIndexes) {
		throw throwEx();
	}

	@Override
	public IDictionary binOpLeftAndAppend(BinaryOperator op, double[] v, IColIndex colIndexes) {
		throw throwEx();
	}

	@Override
	public IDictionary binOpLeftWithReference(BinaryOperator op, double[] v, IColIndex colIndexes, double[] reference,
		double[] newReference) {
		throw throwEx();
	}

	@Override
	public IDictionary binOpRight(BinaryOperator op, double[] v, IColIndex colIndexes) {
		throw throwEx();
	}

	@Override
	public IDictionary binOpRightAndAppend(BinaryOperator op, double[] v, IColIndex colIndexes) {
		throw throwEx();
	}

	@Override
	public IDictionary binOpRight(BinaryOperator op, double[] v) {
		throw throwEx();
	}

	@Override
	public IDictionary binOpRightWithReference(BinaryOperator op, double[] v, IColIndex colIndexes, double[] reference,
		double[] newReference) {
		throw throwEx();
	}

	@Override
	public IDictionary clone() {
		throw throwEx();
	}

	@Override
	public void write(DataOutput out) throws IOException {
		throw throwEx();
	}

	@Override
	public long getExactSizeOnDisk() {
		throw throwEx();
	}

	@Override
	public DictType getDictType() {
		throw throwEx();
	}

	@Override
	public int getNumberOfValues(int nCol) {
		throw throwEx();
	}

	@Override
	public double[] sumAllRowsToDouble(int nrColumns) {
		throw throwEx();
	}

	@Override
	public double[] sumAllRowsToDoubleWithDefault(double[] defaultTuple) {
		throw throwEx();
	}

	@Override
	public double[] sumAllRowsToDoubleWithReference(double[] reference) {
		throw throwEx();
	}

	@Override
	public double[] sumAllRowsToDoubleSq(int nrColumns) {
		throw throwEx();
	}

	@Override
	public double[] sumAllRowsToDoubleSqWithDefault(double[] defaultTuple) {
		throw throwEx();
	}

	@Override
	public double[] sumAllRowsToDoubleSqWithReference(double[] reference) {
		throw throwEx();
	}

	@Override
	public double[] productAllRowsToDouble(int nrColumns) {
		throw throwEx();
	}

	@Override
	public double[] productAllRowsToDoubleWithDefault(double[] defaultTuple) {
		throw throwEx();
	}

	@Override
	public double[] productAllRowsToDoubleWithReference(double[] reference) {
		throw throwEx();
	}

	@Override
	public void colSum(double[] c, int[] counts, IColIndex colIndexes) {
		throw throwEx();
	}

	@Override
	public void colSumSq(double[] c, int[] counts, IColIndex colIndexes) {
		throw throwEx();
	}

	@Override
	public void colSumSqWithReference(double[] c, int[] counts, IColIndex colIndexes, double[] reference) {
		throw throwEx();
	}

	@Override
	public double sum(int[] counts, int nCol) {
		throw throwEx();
	}

	@Override
	public double sumSq(int[] counts, int nCol) {
		throw throwEx();
	}

	@Override
	public double sumSqWithReference(int[] counts, double[] reference) {
		throw throwEx();
	}

	@Override
	public String getString(int colIndexes) {
		throw throwEx();
	}

	@Override
	public IDictionary sliceOutColumnRange(int idxStart, int idxEnd, int previousNumberOfColumns) {
		throw throwEx();
	}

	@Override
	public boolean containsValue(double pattern) {
		throw throwEx();
	}

	@Override
	public boolean containsValueWithReference(double pattern, double[] reference) {
		throw throwEx();
	}

	@Override
	public long getNumberNonZeros(int[] counts, int nCol) {
		throw throwEx();
	}

	@Override
	public int[] countNNZZeroColumns(int[] counts) {
		throw throwEx();
	}

	@Override
	public long getNumberNonZerosWithReference(int[] counts, double[] reference, int nRows) {
		throw throwEx();
	}

	@Override
	public void addToEntry(double[] v, int fr, int to, int nCol) {
		throw throwEx();
	}

	@Override
	public void addToEntry(double[] v, int fr, int to, int nCol, int rep) {
		throw throwEx();
	}

	@Override
	public void addToEntryVectorized(double[] v, int f1, int f2, int f3, int f4, int f5, int f6, int f7, int f8, int t1,
		int t2, int t3, int t4, int t5, int t6, int t7, int t8, int nCol) {
		throw throwEx();
	}

	@Override
	public IDictionary subtractTuple(double[] tuple) {
		throw throwEx();
	}

	@Override
	public MatrixBlockDictionary getMBDict(int nCol) {
		throw throwEx();
	}

	@Override
	public IDictionary scaleTuples(int[] scaling, int nCol) {
		throw throwEx();
	}

	@Override
	public IDictionary preaggValuesFromDense(int numVals, IColIndex colIndexes, IColIndex aggregateColumns, double[] b,
		int cut) {
		throw throwEx();
	}

	@Override
	public IDictionary replace(double pattern, double replace, int nCol) {
		throw throwEx();
	}

	@Override
	public IDictionary replaceWithReference(double pattern, double replace, double[] reference) {
		throw throwEx();
	}

	@Override
	public void product(double[] ret, int[] counts, int nCol) {
		throw throwEx();
	}

	@Override
	public void productWithDefault(double[] ret, int[] counts, double[] def, int defCount) {
		throw throwEx();
	}

	@Override
	public void productWithReference(double[] ret, int[] counts, double[] reference, int refCount) {
		throw throwEx();
	}

	@Override
	public void colProduct(double[] res, int[] counts, IColIndex colIndexes) {
		throw throwEx();
	}

	@Override
	public void colProductWithReference(double[] res, int[] counts, IColIndex colIndexes, double[] reference) {
		throw throwEx();
	}

	@Override
	public CM_COV_Object centralMoment(ValueFunction fn, int[] counts, int nRows) {
		throw throwEx();
	}

	@Override
	public CM_COV_Object centralMoment(CM_COV_Object ret, ValueFunction fn, int[] counts, int nRows) {
		throw throwEx();
	}

	@Override
	public CM_COV_Object centralMomentWithDefault(ValueFunction fn, int[] counts, double def, int nRows) {
		throw throwEx();
	}

	@Override
	public CM_COV_Object centralMomentWithDefault(CM_COV_Object ret, ValueFunction fn, int[] counts, double def,
		int nRows) {
		throw throwEx();
	}

	@Override
	public CM_COV_Object centralMomentWithReference(ValueFunction fn, int[] counts, double reference, int nRows) {
		throw throwEx();
	}

	@Override
	public CM_COV_Object centralMomentWithReference(CM_COV_Object ret, ValueFunction fn, int[] counts, double reference,
		int nRows) {
		throw throwEx();
	}

	@Override
	public IDictionary rexpandCols(int max, boolean ignore, boolean cast, int nCol) {
		throw throwEx();
	}

	@Override
	public IDictionary rexpandColsWithReference(int max, boolean ignore, boolean cast, int reference) {
		throw throwEx();
	}

	@Override
	public double getSparsity() {
		throw throwEx();
	}

	@Override
	public void multiplyScalar(double v, double[] ret, int off, int dictIdx, IColIndex cols) {
		throw throwEx();
	}

	@Override
	public void TSMMWithScaling(int[] counts, IColIndex rows, IColIndex cols, MatrixBlock ret) {
		throw throwEx();
	}

	@Override
	public void MMDict(IDictionary right, IColIndex rowsLeft, IColIndex colsRight, MatrixBlock result) {
		throw throwEx();
	}

	@Override
	public void MMDictDense(double[] left, IColIndex rowsLeft, IColIndex colsRight, MatrixBlock result) {
		throw throwEx();
	}

	@Override
	public void MMDictSparse(SparseBlock left, IColIndex rowsLeft, IColIndex colsRight, MatrixBlock result) {
		throw throwEx();
	}

	@Override
	public void TSMMToUpperTriangle(IDictionary right, IColIndex rowsLeft, IColIndex colsRight, MatrixBlock result) {
		throw throwEx();
	}

	@Override
	public void TSMMToUpperTriangleDense(double[] left, IColIndex rowsLeft, IColIndex colsRight, MatrixBlock result) {
		throw throwEx();
	}

	@Override
	public void TSMMToUpperTriangleSparse(SparseBlock left, IColIndex rowsLeft, IColIndex colsRight,
		MatrixBlock result) {
		throw throwEx();
	}

	@Override
	public void TSMMToUpperTriangleScaling(IDictionary right, IColIndex rowsLeft, IColIndex colsRight, int[] scale,
		MatrixBlock result) {
		throw throwEx();
	}

	@Override
	public void TSMMToUpperTriangleDenseScaling(double[] left, IColIndex rowsLeft, IColIndex colsRight, int[] scale,
		MatrixBlock result) {
		throw throwEx();
	}

	@Override
	public void TSMMToUpperTriangleSparseScaling(SparseBlock left, IColIndex rowsLeft, IColIndex colsRight, int[] scale,
		MatrixBlock result) {
		throw throwEx();
	}

	@Override
	public IDictionary cbind(IDictionary that, int nCol) {
		throw throwEx();
	}

	@Override
	public boolean equals(IDictionary o) {
		throw throwEx();
	}

	@Override
	public boolean equals(double[] v) {
		throw throwEx();
	}

	@Override
	public IDictionary reorder(int[] reorder) {
		throw throwEx();
	}

	@Override
	public void MMDictScaling(IDictionary right, IColIndex rowsLeft, IColIndex colsRight, MatrixBlock result,
		int[] scaling) {
		throw throwEx();
	}

	@Override
	public void MMDictScalingDense(double[] left, IColIndex rowsLeft, IColIndex colsRight, MatrixBlock result,
		int[] scaling) {
		throw throwEx();
	}

	@Override
	public void MMDictScalingSparse(SparseBlock left, IColIndex rowsLeft, IColIndex colsRight, MatrixBlock result,
		int[] scaling) {
		throw throwEx();
	}

	@Override
	public IDictionary rightMMPreAggSparse(int numVals, SparseBlock b, IColIndex thisCols, IColIndex aggregateColumns,
		int nColRight) {
		throw throwEx();
	}

	@Override
	public void putSparse(SparseBlock sb, int idx, int rowOut, int nCol, IColIndex columns) {
		throw throwEx();
	}

	@Override
	public void putDense(DenseBlock sb, int idx, int rowOut, int nCol, IColIndex columns) {
		throw throwEx();
	}

	@Override
	public IDictionary append(double[] row) {
		throw throwEx();
	}

	@Override
	public double[] getRow(int i, int nCol) {
		throw throwEx();
	}

	private RuntimeException throwEx() {
		return new RuntimeException("Dictionary does not support Operations");
	}
}
