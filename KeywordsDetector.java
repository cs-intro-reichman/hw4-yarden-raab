public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i=0; i<sentences.length; i++) {
            for (int j=0; j<keywords.length; j++) {
                String lowcase1 = sentences[i].toLowerCase();
                String lowcase2 = keywords[j].toLowerCase();
                if (contains(lowcase1, lowcase2) == true) {
                    System.out.println(sentences[i]);
                    break;
                }
            }
        }
    }






    // check if str2 appear in str1
    public static boolean contains(String str1, String str2) {
        if ((str1 == null) || (str2 == null)) {
            return false;
        }
        if (str2.equals("")) {
            return true;
        }
        if ((str1.length() < str2.length())) {
            return false;
        }
        for (int i=0; i <= str1.length() - str2.length(); i++){
            if (fromThisChar(i, str1, str2) == true) {
                return true;
            }
        }
        return false;
    }
    public static boolean fromThisChar (int i, String str1, String str2) {
        int i2 = 0;
        while (i < str1.length()) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i2);
            if (c1 != c2) {
                return false;
            }
            else {
                i2 ++;
                i++;
            }
            if (i2 == str2.length()) {
                return true;
            }
        }
        return false;
        
    }
}

