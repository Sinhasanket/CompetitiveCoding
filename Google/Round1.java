package Google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Round1 {
    public static void main(String[] args){
        try{
            FIO in = new FIO();
            int totalBooks = in.nextInt();
            int totalLib = in.nextInt();
            int totalDays = in.nextInt();

            int scoresOfBooks[]=new int[(int)totalBooks];
            for (int i=0;i<totalBooks;i++) scoresOfBooks[i]=in.nextInt();

            ArrayList<ArrayList<Integer>> hm =
                    new ArrayList<ArrayList<Integer>>((int)totalBooks+1);

            for (int i = 0; i < totalBooks+1; i++)
                hm.add(new ArrayList<Integer>());

            TreeMap<Integer,Integer> signupProcess = new TreeMap<>();

            ArrayList<Integer> shipPerDay = new ArrayList<>();

            int libNum = 0;
            while (totalLib-->0){
                long booksInLib = in.nextLong();
                signupProcess.put(libNum,in.nextInt());
                shipPerDay.add(in.nextInt());

                for (int i=0;i<booksInLib;i++){
                    hm.get((int)libNum).add(in.nextInt());
                }
                libNum++;
            }

            int numberOfSignup = 0;
            int total = 0;
            ArrayList<Integer> numberOfLibraryToShip = new ArrayList<>();

            for (Map.Entry ittree : signupProcess.entrySet()){
                int key = (int)ittree.getKey();
                int value = (int) ittree.getValue();
                if(total <totalDays){
                    total+=value;
                    numberOfLibraryToShip.add(key);
                    numberOfSignup++;
                }else break;
            }

            System.out.println(numberOfSignup);


            int z=0;
          // ArrayList<Long> ans = new ArrayList();
            while (numberOfSignup-->0){
                    System.out.print(signupProcess.get(z)-2+" ");
                    long len =(long) hm.get(z).size();
                    System.out.println(len);

                    for (int i=0;i<hm.get(z).size();i++){
                        System.out.print(hm.get(z).get(i)+" ");
                    }

                    z++;
                    System.out.println();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            return;
        }
    }

    static class FIO {
        BufferedReader br;
        StringTokenizer st;

        public FIO() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}