// 1108. Defanging an IP Address

// https://leetcode.com/problems/defanging-an-ip-address/description/

class Solution {
    public String defangIPaddr(String address) {
        StringBuilder defanged = new StringBuilder();

        for(int i = 0; i < address.length(); i++){
            if(address.charAt(i) == '.'){
                defanged.append("[.]");
            }
            else defanged.append(address.charAt(i));
        }
    return defanged.toString(); 
    }
}
