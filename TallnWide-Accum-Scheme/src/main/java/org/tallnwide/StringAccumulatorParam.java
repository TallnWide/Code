

package org.tallnwide;
import org.apache.spark.AccumulatorParam;

public class StringAccumulatorParam implements AccumulatorParam<String> {


	public String addInPlace(String arg0, String arg1) {
		arg0=arg0.concat(arg1);
		return arg0;
	}

	public String zero(String arg0) {
		return arg0;
	}

	public String addAccumulator(String arg0, String arg1) {
		return addInPlace(arg0,arg1);
	}
	

}
