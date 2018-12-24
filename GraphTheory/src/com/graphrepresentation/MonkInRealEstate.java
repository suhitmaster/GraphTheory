/*
 * 
 * The Monk wants to buy some cities. To buy two cities, he needs to buy the road connecting those two cities. Now, you are given a list of roads, bought by the Monk. You need to tell how many cities did the Monk buy.

Input:
First line contains an integer T, denoting the number of test cases. The first line of each test case contains an integer E, denoting the number of roads. The next E lines contain two space separated integers X and Y, denoting that there is an road between city X and city Y.

Output:
For each test case, you need to print the number of cities the Monk bought.

Constraint:
1 <= T <= 100
1 <= E <= 1000
1 <= X, Y <= 10000
 */

package com.graphrepresentation;
import java.io.*;
import java.util.*;
  
public class MonkInRealEstate {
	  public static void main(String args[]) throws Exception {
	      InputReader sc = new InputReader(System.in);
	      PrintWriter pw = new PrintWriter(System.out);
	      int t = sc.nextInt();
	      while(t-->0)
	      {
	        int n = sc.nextInt();
	        HashSet<Integer> set = new HashSet<Integer>();
	        for(int i=0;i<n;i++)
	        {
	          set.add(sc.nextInt());
	          set.add(sc.nextInt());
	        }
	        pw.println(set.size());
	      }
	 
	      pw.close();
	  }
	 
	    static class InputReader {
	        private InputStream stream;
	        private byte[] buf = new byte[1024];
	        private int curChar;
	        private int numChars;
	        private SpaceCharFilter filter;
	 
	        public InputReader(InputStream stream) {
	            this.stream = stream;
	        }
	 
	        public int read() {
	            if (numChars == -1)
	                throw new InputMismatchException();
	 
	            if (curChar >= numChars) {
	                curChar = 0;
	                try {
	                    numChars = stream.read(buf);
	                } catch (IOException e) {
	                    throw new InputMismatchException();
	                }
	 
	                if (numChars <= 0)
	                    return -1;
	            }
	            return buf[curChar++];
	        }
	 
	        public String nextLine() {
	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	            String str = "";
	            try {
	                str = br.readLine();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	            return str;
	        }
	 
	        public int nextInt() {
	            int c = read();
	 
	            while (isSpaceChar(c))
	                c = read();
	 
	            int sgn = 1;
	 
	            if (c == '-') {
	                sgn = -1;
	                c = read();
	            }
	 
	            int res = 0;
	            do {
	                if (c < '0' || c > '9')
	                    throw new InputMismatchException();
	                res *= 10;
	                res += c - '0';
	                c = read();
	            }
	            while (!isSpaceChar(c));
	 
	            return res * sgn;
	        }
	 
	        public long nextLong() {
	            int c = read();
	            while (isSpaceChar(c))
	                c = read();
	            int sgn = 1;
	            if (c == '-') {
	                sgn = -1;
	                c = read();
	            }
	            long res = 0;
	 
	            do {
	                if (c < '0' || c > '9')
	                    throw new InputMismatchException();
	                res *= 10;
	                res += c - '0';
	                c = read();
	            }
	            while (!isSpaceChar(c));
	            return res * sgn;
	        }
	 
	        public double nextDouble() {
	            int c = read();
	            while (isSpaceChar(c))
	                c = read();
	            int sgn = 1;
	            if (c == '-') {
	                sgn = -1;
	                c = read();
	            }
	            double res = 0;
	            while (!isSpaceChar(c) && c != '.') {
	                if (c == 'e' || c == 'E')
	                    return res * Math.pow(10, nextInt());
	                if (c < '0' || c > '9')
	                    throw new InputMismatchException();
	                res *= 10;
	                res += c - '0';
	                c = read();
	            }
	            if (c == '.') {
	                c = read();
	                double m = 1;
	                while (!isSpaceChar(c)) {
	                    if (c == 'e' || c == 'E')
	                        return res * Math.pow(10, nextInt());
	                    if (c < '0' || c > '9')
	                        throw new InputMismatchException();
	                    m /= 10;
	                    res += (c - '0') * m;
	                    c = read();
	                }
	            }
	            return res * sgn;
	        }
	 
	        public String readString() {
	            int c = read();
	            while (isSpaceChar(c))
	                c = read();
	            StringBuilder res = new StringBuilder();
	            do {
	                res.appendCodePoint(c);
	                c = read();
	            }
	            while (!isSpaceChar(c));
	 
	            return res.toString();
	        }
	 
	        public boolean isSpaceChar(int c) {
	            if (filter != null)
	                return filter.isSpaceChar(c);
	            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	        }
	 
	        public String next() {
	            return readString();
	        }
	 
	        public interface SpaceCharFilter {
	            public boolean isSpaceChar(int ch);
	        }
	    }
	 
	    static class Node implements Comparable<Node> {
	        int v;
	        int w;
	 
	        Node(int v, int w) {
	            this.v = v;
	            this.w = w;
	        }
	 
	        public int compareTo(Node node) {
	            if (w == node.w)
	                return Integer.compare(v, node.v);
	 
	            return (-1) * Integer.compare(w, node.w);
	        }
	    }

}
