package dfghj;
public class NeedleInHaystack {

	public static void main(String[] args) {
		String haystack="sadbutsad";
		String needle="sad";
		
	        if (haystack == null || needle == null || needle.length() == 0) {
	            System.out.println(-1);
	        }
	        int index = haystack.indexOf(needle); 
	        System.out.println(index);;
	    }

}
