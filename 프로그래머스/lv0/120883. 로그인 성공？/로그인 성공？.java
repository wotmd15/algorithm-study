class Solution {
    public String solution(String[] id_pw, String[][] db) {
        boolean isIdMatch = false;
        boolean isPwMatch = false;
        for(int i = 0; i < db.length; i ++){
            if(id_pw[0].equals(db[i][0])){ //ID가 같으면
                isIdMatch = true;
                if(id_pw[1].equals(db[i][1])) { // PW가 같으면
                    isPwMatch = true;
                };
            };
        }
        return (isIdMatch && isPwMatch) ? "login" : ((isIdMatch && !isPwMatch) ? "wrong pw" : "fail");
    }
}