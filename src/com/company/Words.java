package com.company;

import java.util.Random;

public class Words {
    private String pronoun[]={
            "你","我","他","她","它","你们","我们","他们","它们","她们","大家","人们","人"
    };
    private String noun[]={//名词--主宾
            "问题","关键","意义","重要性","内容","角色","事实"
            //,"","","","","","","","","","","","","","","","","",
    };
    private String verb[]={//动词--谓
            "是","值得","热爱","重视","认识","了解","觉得","认为","思考","解决","发展",
            "分析","研究","喜欢","调查","想象","想","谅解","解释","说明","代表","突出","去除"
    };
    private String adj[]={//形容词--定
            "实际","严谨","困难","逐渐","快速","缓慢","慎重","着重","细致","辣鸡",
            "谨慎","认真","简明","简洁","庞大","突出","明显","重要","次要","渺小","极致"
    };
    public String chRand(String []a){
        Random rd=new Random();
        return a[rd.nextInt(a.length)];
    }
    public String getPronoun(){
        return chRand(pronoun);
    }
    public String getNoun(){
        return chRand(noun);
    }
    public String getVerb(){
        String temp=chRand(verb);
        if(temp!="是"&&temp!="值得"&&temp!="觉得"&&temp!="认为"
                &&temp!="喜欢"&&temp!="热爱") return temp+"了";
        else return temp;
    }
    public String getAdj(){
        return chRand(adj)+"的";
    }
    public String getAdv(){
        return chRand(adj)+"地";
    }
}
