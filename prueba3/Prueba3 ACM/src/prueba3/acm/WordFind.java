/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba3.acm;

/**
 *
 * @author rvale
 */
public class WordFind {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WordFind obj = new WordFind();
    }
    
    public WordFind(){

        String[]grid = {"TEST","GOAT","BOAT"};
        String[]wordList = {"GOAT","BOAT","TEST","TGB","TOA"};
        
        System.out.println("the grid is");
        for(int n=0;n<grid.length;n++){
        System.out.println(grid[n]);
        }
        System.out.println("Words to find are:");
        for(int j=0;j<wordList.length;j++){
        System.out.println(wordList[j]);
        }
        System.out.println("results are");
                String[]result = findWords(grid,wordList);
        for(int i=0;i<result.length;i++){
        System.out.println(result[i]);
        }
        
        
    }
    
    public String[] findWords(String[]grid,String[]wordList){
    String[]results = new String[wordList.length];
    int length = grid[0].length();
    for(int i =0;i<wordList.length;i++){
        if ((grid.length>=wordList[i].length())&&(wordList[i].length()<=length)){
            System.out.println("Diagonal");
           // results[i]= diagonal(grid, wordList[i],length);
           results[i]= vertical(grid, wordList[i],length);
        }
        else if(wordList[i].length() == length){
            System.out.println("Horizontal");
            results[i]= horizontal(grid, wordList[i]);
        }
        else if(grid.length==wordList[i].length()){
            System.out.println("Vertical");
            results[i]= vertical(grid, wordList[i],length);
        }
        else{
        results[i] = "n";
        }
            
    }
    
    
    return results;
    }
    
    public String horizontal(String[]grid, String word){
        for(int j=0;j<grid.length;j++){
                int index = grid[j].indexOf(word);
                    if(index!= -1){
                        String result =""+j+" "+index+"";
                        return result;
                    }
            }
        return "n";
    }
    
    public String vertical (String[]grid, String word, int length){
        for(int i = 0;i<length;i++){
            String column="";
            for(int n=0;n<grid.length;n++){
                column = column+grid[n].charAt(i);
                
            }
            System.out.println(column);
            int index = column.indexOf(word);
                    if(index!= -1){
                        String result =""+index+" "+i+"";
                        return result;
                    }
        
        }
        
      return "n";  
    }
    
    public String diagonal (String[]grid, String word, int length){
        for(int i=0;i<grid.length;i++){
            char ch = word.charAt(0);
            if(grid[i].contains(ch+"")){
                String diag = "";
                int index = grid[i].indexOf(ch+"");
                int current = i;
                for(int n = index;n<length;n++){
                    String gridV = ""+grid[current].charAt(index);
                    diag = diag+gridV;
                    current++;
                }
                System.out.println(diag);
                if(diag.indexOf(word)==0){
                    String result = ""+i+" "+grid[i].indexOf(ch+"")+"";
                    return result;
                }
            }
        
        }
    
    
    return "n";
    }
    
}
