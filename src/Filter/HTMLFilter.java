package Filter;

public class HTMLFilter implements Filter{

	@Override
	public String doFilter(String str) {
		String r = str.replace('<', '[').replace('>', ']');
		return r;
	}

}
