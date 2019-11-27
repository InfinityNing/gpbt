package com.company;

import java.util.Random;

//定主状谓补宾
public class Sentence {
    private String subject1,subject2;//主语
    private String predicate;//谓语
    private String object;//宾语
    private String attibute1,attibute2;//定语
    private String adverb;//状语
    private String tsub,tpre,tobj;//从句
    private Words w=new Words();
    public Sentence(){//构造
        subject1=w.getPronoun();subject2=w.getNoun();predicate=w.getVerb();
        object=w.getNoun();attibute1=w.getAdj();attibute2=w.getAdj();
        adverb=w.getAdv();tsub=w.getNoun();tpre=w.getVerb();tobj=w.getNoun();
    }
    public String making(){
        Random rd=new Random();
        int temp=rd.nextInt(12);
        switch(temp){//不同句型
            case 0:return attibute1+subject1+adverb+predicate+object;
            case 1:return attibute1+subject2+adverb+predicate+object;
            case 2:return attibute1+subject1+adverb+predicate+"，"+tsub+tpre+tobj;
            case 3:return subject1+adverb+predicate+object;
            case 4:return subject1+adverb+predicate+attibute2+object;
            case 5:return subject2+adverb+predicate+attibute2+object;
            case 6:return subject2+adverb+predicate+object;
            case 7:return subject2+predicate+object;
            case 8:return subject1+predicate+object;
            case 9:return attibute1+subject1+predicate+object;
            case 10:return attibute1+subject2+predicate+object;
            case 11:return attibute1+subject2+predicate+"，"+tsub+tpre+tobj;
            default:return null;
        }
    }
}
