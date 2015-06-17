package za.co.arkitex.mobile.domain;


import java.util.ArrayList;

/**
 *
 * @author Luckson
 * @version 1.0 
 * @see  This is an algorithm for multi-select
 */
public class TokenizeString {

    private ArrayList<StringBuilder> sqlList = new ArrayList<StringBuilder>();
    private StringBuilder processed;
    
    public void addOption(String lineToParse) {
        String[] tokens = lineToParse.split(",");

        for (int i = 0; i < tokens.length; i++) {
//            System.out.println(tokens[i]);
            appendOption(tokens[i]);
        }
    }
    
    public void appendOption(String option) {
        StringBuilder sql = new StringBuilder();
        sql.append(" OR b.Brand = '" + option + "'");
//        System.out.println(sql);
        sqlList.add(sql);
        
    }
    
    public String getProcessedSQL() {
    
    	return new String(processed).replaceFirst("OR", "AND(");
    }
    
    public void processRawMaterial(String raw) {
    	
//        String raw = "Product 1/Product 2/Product 3/Product 4/Product 5";
     
        this.addOption(raw);
        processed = new StringBuilder();
        
        for (int i = 0; i < this.sqlList.size(); i ++) {
        	processed.append(this.sqlList.get(i));
        }
//   	System.out.println(this.processed);
    }
    
    
    public static void main(String[] args) {
        
        TokenizeString token = new TokenizeString();
        String raw = "Product 1/Product 2/Product 3/Product 4/Product 5";
        
        token.addOption(raw);
        token.processed = new StringBuilder();
        
        for (int i = 0; i < token.sqlList.size(); i ++) {
            
        	token.processed.append(token.sqlList.get(i));
        }
        
        System.out.println("Return :" + token.getProcessedSQL());
       
    }
    
}
