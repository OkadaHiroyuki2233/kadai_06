package com.company;

  public class Peason {

     public String myname;

     public String syushin;

     public Peason(String myname, String syushin) {
        this .myname = myname;
        this .syushin = syushin;
    }

   public String getSelfIntroduction(){
        return "私の名前は" + myname + "です。" + syushin + "出身です。";
    }
}
