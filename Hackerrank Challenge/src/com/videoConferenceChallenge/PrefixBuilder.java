package com.videoConferenceChallenge;

import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'solve' function below.
	 *
	 * The function is expected to return a STRING_ARRAY. The function accepts
	 * STRING_ARRAY names as parameter.
	 */

	public static List<String> solve(List<String> names) {

		// names.remove(0);
		List<String> prefixList = new ArrayList<>();
		List <String> tmp = new ArrayList<>(names);
		for (String name:names) {
			int i = 0;
			int j = 1;
			while(prefixList.contains(name.substring(i, j)))
				j++;
			String regex = name.substring(i, j);
			Pattern pattern = Pattern.compile(regex);
			tmp.remove(name);
			tmp.stream().forEach((var)-> System.out.println(var));
			for(String s:tmp)
			{
				Matcher matcher = pattern.matcher(s.substring(i,j+1));
				//tmp.stream().forEach((var)-> System.out.println(var));
				if(matcher.find(i))
				{
					j++;
				}
				
			}
			tmp.add(name);
			/*for(String prefix : prefixList) {
				if(prefix+".*".)
			}*/
			prefixList.add(name.substring(i, j));
				
			
//				i++;
			//System.out.println(name);
		}
		prefixList.stream().forEach((i)-> System.out.println(i));
		return names;

	}

}

public class PrefixBuilder {
	public static void main(String[] args) throws IOException {

		System.out.println("Starting...");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.in));
		int n = Integer.parseInt(bufferedReader.readLine().trim());
		List<String> names = IntStream.range(0, n).mapToObj(i -> {
			try {
				return bufferedReader.readLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		}).collect(toList());

		List<String> res = Result.solve(names);

		/*
		 * bufferedWriter.write( res.stream() .collect(joining("\n")) + "\n" );
		 */

		bufferedReader.close();
		// bufferedWriter.close();
	}
}
