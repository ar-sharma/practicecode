package demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ReadFile {
	
	public static void main(String[] args) throws Exception {
		
		List<String> l1=new ArrayList<String>();
		List<String> l2=new ArrayList<String>();
		FileReader fir=new FileReader("/home/ar.sharma/name.txt");
        BufferedReader in = new BufferedReader(fir);
        String line = "";
        while ((line = in.readLine()) != null) {
        	
            String parts[] = line.split(" +");
            if(l1.contains(parts[0])){
            	int i=l1.indexOf(parts[0]);
            	//int m=Integer.parseInt(l2.get(i));
            	//int n=Integer.parseInt(parts[1]);
            	//int res=m+n;
            	int res=Integer.parseInt(l2.get(i))+Integer.parseInt(parts[1]);
            	String newsal=Integer.toString(res);
            	l2.set(i, newsal);
            	}
            else{
           l1.add(parts[0]);
           l2.add(parts[1]);
            }
        }
        
        in.close();
        System.out.println("list1: "+l1);
        System.out.println("list2: "+l2);
              
   }
	
}
