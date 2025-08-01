package problem3;
public class WordSearch2D {

 
    public static boolean search(char[][] matrix, String word) {
        
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        
        for (int i = 0; i < rows; i++) {
            StringBuilder rowStr = new StringBuilder();
            
            for (int j = 0; j < cols; j++) {
                rowStr.append(matrix[i][j]);
            }
         
            if (rowStr.toString().contains(word)) {
                return true;
            }
        }

     
        for (int j = 0; j < cols; j++) {
            StringBuilder colStr = new StringBuilder();
        
            for (int i = 0; i < rows; i++) {
                colStr.append(matrix[i][j]);
            }
          
            if (colStr.toString().contains(word)) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        char[][] matrix = {
            {'F', 'A', 'C', 'I'},
            {'O', 'B', 'Q', 'P'},
            {'A', 'N', 'O', 'B'},
            {'M', 'A', 'S', 'S'}
        };

       
        String word1 = "FOAM";
        System.out.println("Does \"" + word1 + "\" exist? " + search(matrix, word1)); // Expected: true

        String word2 = "MASS";
        System.out.println("Does \"" + word2 + "\" exist? " + search(matrix, word2)); // Expected: true

        String word3 = "FACE";
        System.out.println("Does \"" + word3 + "\" exist? " + search(matrix, word3)); // Expected: false
    }
}
