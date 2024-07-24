//Title: V4 AIO Amethyst Crafter/Fletcher Hinamizawa
//____________________________________________________________________________________________
//Users Decision variables Down Below:
int user_decision = 3;
//0 Bolt Tips
//1 Arrow tips
//2 Javelin Heads
//3 Dart Tips
//____________________________________________________________________________________________
//Hinamizawa's codes down below:
int amethystRock = 21347;
int chisel = 1755;
int rockCounter = v.getInventory().count(amethystRock);
int rockSlot = v.getInventory().count(amethystRock);
int chiselSlot = v.getInventory().slot(chisel);
Widget multiSkillMenu = client.getWidget(270,13);


   private void setAmethystCreation() {
    if (user_decision == 0) {
    v.invoke("Make","<col=ff9040>Amethyst bolt tips</col>",1,57,-1,17694734,false);
}
    else if (user_decision == 1) {
        v.invoke("Make","<col=ff9040>Amethyst arrowtips</col>",1,57,-1,17694735,false);
    }
    else if (user_decision == 2) {
        v.invoke("Make","<col=ff9040>Amethyst javelin heads</col>",1,57,-1,17694736,false);
    }
    else if (user_decision == 3) {
       v.invoke("Make","<col=ff9040>Amethyst dart tips</col>",1,57,-1,17694737,false);
    }
}


if (rockCounter == 0 && !v.getBank().isOpen())
{ 
 v.getBank().open();

}
else if (rockCounter == 0 && v.getBank().isOpen())
{
    v.getBank().withdraw(amethystRock,26);
    v.getBank().close();
}
else if (multiSkillMenu != null && v.getLocalPlayer().hasAnimation(-1)) {
   setAmethystCreation();
}
else if (rockCounter >= 26 && !v.getBank().isOpen() && !v.getLocalPlayer().hasAnimation(6295)) {
v.invoke("Use","<col=ff9040>Chisel</col>",0,25,chiselSlot,9764864,false);
v.invoke("Use","<col=ff9040>Chisel</col><col=ffffff> -> <col=ff9040>Amethyst</col>",0,58,rockSlot,9764864,false);
}
