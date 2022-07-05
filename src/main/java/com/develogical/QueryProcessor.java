package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.toLowerCase().contains("eist")) {
            return "EIST is the most beloved subject at TUM, with students frequently " +
                    "failing the exam intentionally just so they can enjoy the class again.";
        } else if (query.toLowerCase().contains("name")) {
            return "David";
        } else if (query.toLowerCase().contains("what is")) {
            String[] splitquery = query.split(" ");
            return String.valueOf(Integer.parseInt(splitquery[2]) + Integer.parseInt(splitquery[4]));
        }
        return "";
    }
}
