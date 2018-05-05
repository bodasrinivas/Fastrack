

import java.util.*;
import java.util.Map;
import java.util.TreeMap;

public class HelloWorld {

	public static void main(String [] args){
		
		    Map<Long, Object> map = new TreeMap<Long, Object>();
		   
		      map.put(92L,"92");
		      map.put( 34L,"34");
		      map.put( 45L,"45");
		      map.put(-65L,"-65");
		      map.put(34L,"34");
		      map.put( -7L,"-7");
		      map.put(9L ,"9");
		      map.put( -3L,"-3");
		      map.put( 2L,"2");
		      
		       
		    System.out.println(findNearest(map, 0)); 
		   
		}

		private static Object findNearest(Map<Long, Object> map, long value) {
		    Map.Entry<Long, Object> previousEntry = null;
		    for (Map.Entry<Long, Object> e : map.entrySet()) {
		        if (e.getKey().compareTo(value) >= 0) {
		            if (previousEntry == null) {
		                return e.getValue();
		            } else {
		                if (e.getKey() - value >= value - previousEntry.getKey()) {
		                    return previousEntry.getValue();
		                } else {
		                    return e.getValue();
		                }
		            }
		        }
		        previousEntry = e;
		    }
		    return previousEntry.getValue();
		}

	}


