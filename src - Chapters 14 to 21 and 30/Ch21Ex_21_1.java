/* From 21.1 on p.818
 * "(Perform set operations on hash sets)
 * Create two linked hash sets {(...)}{(...)}
 * and find their union, difference, and intersection.
 * (You can clone the sets to preserve the original sets from being changed by these set methods.)"
 * 
 * THOMAS' NOTE | 
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class Ch21Ex_21_1
{
public static void main(String[] args)
	{
		String[] t1982 = new String[]{"Kevin", "Alan", "Lora", "Edward", "Sark", "Tron", "Crom", "Ram", "Castor", "Bit"};
			LinkedHashSet<String> s1982 = new LinkedHashSet<>(Arrays.asList(t1982));
		String[] tl2010 = new String[]{"Kevin", "Sam", "Quorra", "Alan", "Ed Jr", "Clu 2", "Rinzler", "Zuse", "Daft Punk"};
			LinkedHashSet<String> s2010 = new LinkedHashSet<>(Arrays.asList(tl2010));
		System.out.println("A list of main characters from \"Tron\" (1982) includes: "+s1982);
		System.out.println("A list of main characters from \"Tron: Legacy\" (2010) includes: "+s2010+"\n");
	@SuppressWarnings("unchecked")
		LinkedHashSet<String> theirUnion =	(LinkedHashSet<String>)s1982.clone();
			theirUnion.addAll(s2010);
		System.out.println("Our combined list of characters (their \"union\") is...\n\t"+theirUnion+"\n");
	@SuppressWarnings("unchecked")
		LinkedHashSet<String> theirInter = (LinkedHashSet<String>) s1982.clone();
			theirInter.retainAll(s2010);
		System.out.println("The characters shared between our lists (their \"intersection\") are...\n\t"+theirInter+"\n");
	@SuppressWarnings("unchecked")
		HashSet<String> diff2B = (LinkedHashSet<String>) s1982.clone();
	@SuppressWarnings("unchecked")
		HashSet<String> diffToBe = (LinkedHashSet<String>) s2010.clone();
			diff2B.removeAll(s2010);
			diffToBe.removeAll(s1982);
			diff2B.addAll(diffToBe);
		System.out.println("The characters not shared between our lists (their \"difference\" are...\n\t"+diff2B);
	}
}