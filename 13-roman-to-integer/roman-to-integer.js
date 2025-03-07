/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    let charmap = new Map([
        ['I',1],
        ['V',5],
        ['X',10],
        ['L', 50],
        ['C',100],
        ['D',500],
        ['M',1000]
    ]);// WE HAVE MAPPED NUMS
    //we already have string s
    let sum = 0;
    for(let i = 0; i< s.length; i++){
        // our current char s[i]
        let curr = charmap.get(s[i]);
        sum = sum + curr;
        if(i > 0){//making sure index is not out of range
            let prev = charmap.get(s[i-1]);
            if(prev < curr){
                sum = sum - 2*prev;
            }
        }
    }
    return sum;
};

