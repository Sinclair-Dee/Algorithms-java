//暴力子字符串查找
//下边的代码属于隐式回退
public static int search(string pat, string txt){
    int M = pat.length();
    int N = pat.length();
    for(int i = 0; i <= N-M; i++){
        for(int j = 0; j < M; j++){
            if(txt.charAt(i+j) != pat.charAt(j))
                break;
        if(j == M) return i
        }
    }
    return N;
}

//暴力子字符串查找的另一种实现
//显式回退
public static int search(string pat, string txt){
    int j,M = pat.length();
    int i,N = txt.length();
    for(i = 0, j = 0; i < N && j < M; i++){
        if(txt.charAt(i) == pat.charAt(j)) j++;
        else{i -= j; j = 0; }
    }
    if(j == M) return i-M;//找到匹配
    else       return N;  //未找到匹配
}