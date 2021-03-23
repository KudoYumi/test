package youtube08;

public class SampleException extends RuntimeException{ //独自の例外クラスの宣言

	public SampleException(String message) {
		super(message);
	}

	/* 6行目により、継承関係考えれば、
	 * スーパークラスのRuntimeExceptionに引数渡し、
	 * さらにRuntimeExceptionのスーパークラスExceptionクラスに渡し、
	 * Exceptionクラスのスーパークラスのthrowableクラスに渡される。
	 */


}
