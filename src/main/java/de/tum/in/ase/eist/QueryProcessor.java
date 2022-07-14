package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "Rayen";
        }
        else if (query.contains("what is 14 plus 11")){
    return"25";
        }
        else if (query.contains("plus")){
            String[] helper = query.split(" ");
            String a = helper[1];
            String b = helper [4];
            int c = Integer.valueOf(a) + Integer.valueOf(b);
            return Integer.toString(c);


        }
        else  {
            return "";
        }
    }

}
