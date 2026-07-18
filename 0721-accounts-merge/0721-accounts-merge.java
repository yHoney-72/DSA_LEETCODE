class Solution {
    int parent[];
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n = accounts.size();
        parent = new int[n];
        for(int i =0 ;i<n ;i++){
            parent[i]= i;
        }
       Map<String,Integer>emailAcc = new HashMap<>();
       for(int i = 0 ;i<n; i++){
        for(int j =1 ;j<accounts.get(i).size(); j++){
            String email = accounts.get(i).get(j);
            if(!emailAcc.containsKey(email)){
                emailAcc.put(email,i);
            }else{
                union(i,emailAcc.get(email));
            }
        }
       }
       Map<Integer,TreeSet<String>>accEmail = new HashMap<>();
       for(String email:emailAcc.keySet()){
        int accNo = find(emailAcc.get(email));
        if(!accEmail.containsKey(accNo)){
            accEmail.put(accNo, new TreeSet<>());
        }
        TreeSet<String>curr = accEmail.get(accNo);
        curr.add(email); 
       }
       List<List<String>>res = new ArrayList<>();
       for(int accNo:accEmail.keySet()){
       List<String>sameName = new ArrayList<>(accEmail.get(accNo));
       String name = accounts.get(accNo).get(0);
        sameName.add(0,name);
        res.add(sameName);
       }
       return res;
    }
    private int find(int i){                                    
        if(parent[i]==i){
             return i;
        }
        parent[i] = find(parent[i]);
        return parent[i];
    }
    private void union(int i , int j){
        int parentI = find(i);
        int parentJ = find(j);
        if(parentI!=parentJ){
            parent[parentJ]=parentI;
        } 
    }
}