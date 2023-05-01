package Exceptions;

@SuppressWarnings("serial")
public class LicenceExpiredException extends Exception {
	public LicenceExpiredException (String errmsg) {
		super(errmsg);
	}
}
