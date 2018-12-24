/*
 * 
 * Our Code Monk recently learnt about Graphs and is very excited!

He went over to the Graph-making factory to watch some freshly prepared graphs. Incidentally, one of the workers at the factory was ill today, so Monk decided to step in and do her job.

The Monk's Job is to Identify whether the incoming graph is a tree or not. He is given N, the number of vertices in the graph and the degree of each vertex.

Find if the graph is a tree or not.

Input:
First line contains an integer N, the number of vertices.
Second line contains N space-separated integers, the degrees of the N vertices.

Output:
Print "Yes" (without the quotes) if the graph is a tree or "No" (without the quotes) otherwise.

Constraints:
1 ≤ N ≤ 100
1 ≤ Degreei ≤ 1000
 * 
 * 
 */

package com.graphrepresentation;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
			import java.io.*;
			import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
			        InputReader in = new InputReader(System.in);
			        PrintWriter w = new PrintWriter(System.out);
			        int n=in.nextInt();
			        int sum=0;
			        for(int i=0;i<n;i++){
			        		sum+=in.nextInt();
			        }
			        if(sum/2==n-1)
			        	w.println("Yes");
			        else
			        	w.println("No");
			        w.close();

    }
    			    static class InputReader {
			
			        private InputStream stream;
			        private byte[] buf = new byte[8192];
			        private int curChar, snumChars;
			        private SpaceCharFilter filter;
			
			        public InputReader(InputStream stream) {
			            this.stream = stream;
			        }
			
			        public int snext() {
			            if (snumChars == -1)
			                throw new InputMismatchException();
			            if (curChar >= snumChars) {
			                curChar = 0;
			                try {
			                    snumChars = stream.read(buf);
			                } catch (IOException e) {
			                    throw new InputMismatchException();
			                }
			                if (snumChars <= 0)
			                    return -1;
			            }
			            return buf[curChar++];
			        }
			
			        public int nextInt() {
			            int c = snext();
			            while (isSpaceChar(c))
			                c = snext();
			            int sgn = 1;
			            if (c == '-') {
			                sgn = -1;
			                c = snext();
			            }
			            int res = 0;
			            do {
			                if (c < '0' || c > '9')
			                    throw new InputMismatchException();
			                res *= 10;
			                res += c - '0';
			                c = snext();
			            } while (!isSpaceChar(c));
			            return res * sgn;
			        }
			
			        public long nextLong() {
			            int c = snext();
			            while (isSpaceChar(c))
			                c = snext();
			            int sgn = 1;
			            if (c == '-') {
			                sgn = -1;
			                c = snext();
			            }
			            long res = 0;
			            do {
			                if (c < '0' || c > '9')
			                    throw new InputMismatchException();
			                res *= 10;
			                res += c - '0';
			                c = snext();
			            } while (!isSpaceChar(c));
			            return res * sgn;
			        }
			
			        public int[] nextIntArray(int n) {
			            int a[] = new int[n];
			            for (int i = 0; i < n; i++)
			                a[i] = nextInt();
			            return a;
			        }
			
			        public String readString() {
			            int c = snext();
			            while (isSpaceChar(c))
			                c = snext();
			            StringBuilder res = new StringBuilder();
			            do {
			                res.appendCodePoint(c);
			                c = snext();
			            } while (!isSpaceChar(c));
			            return res.toString();
			        }
			
			        public boolean isSpaceChar(int c) {
			            if (filter != null)
			                return filter.isSpaceChar(c);
			            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
			        }
			
			        public interface SpaceCharFilter {
			            public boolean isSpaceChar(int ch);
			        }
			    }
			}


