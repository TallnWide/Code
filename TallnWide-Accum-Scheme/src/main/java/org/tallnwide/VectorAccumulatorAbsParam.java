

package org.tallnwide;

import org.apache.spark.AccumulatorParam;


public class VectorAccumulatorAbsParam implements AccumulatorParam<double[]> {



	public double[] addInPlace(double[] arg0, double[] arg1) {
		for(int i=0; i< arg0.length; i++)
		{
			arg0[i] += Math.abs(arg1[i]);
		}
		return arg0;
	}
	public double[] zero(double[] arg0) {
		return arg0;
	}

	public double[] addAccumulator(double[] arg0, double[] arg1) {
		return addInPlace(arg0, arg1);		
	}

}
