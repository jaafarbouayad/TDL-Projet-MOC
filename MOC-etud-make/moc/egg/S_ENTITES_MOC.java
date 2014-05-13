package moc.egg;
import moc.compiler.*;
import moc.tds.*;
import moc.type.*;
import moc.gc.*;
import java.util.*;
import mg.egg.eggc.runtime.libjava.lex.*;
import mg.egg.eggc.runtime.libjava.*;
import mg.egg.eggc.runtime.libjava.messages.*;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
import java.util.Vector;
public class S_ENTITES_MOC {
LEX_MOC scanner;
  S_ENTITES_MOC() {
    }
  S_ENTITES_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  TDS att_tds;
  LEX_MOC att_scanner;
  TDS glob_2_t;
  private void regle1() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_gen_1();
  }
  private void regle3() throws Exception {

    //declaration
    S_FONCTION_MOC x_2 = new S_FONCTION_MOC(scanner,att_eval) ;
    S_ENTITES_MOC x_3 = new S_ENTITES_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_3(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
if  (att_eval)      action_gen_3(x_2, x_3);
  }
  private void regle2() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    ASM x_4 = new ASM(scanner.getReporter(), scanner.contexte);
    S_ENTITES_MOC x_6 = new S_ENTITES_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_2(x_4, x_6);
    x_2.analyser(LEX_MOC.token_asm);
if  (att_eval)      action_tds_2(x_4, x_6);
    x_4.scanner.setSource(scanner) ;
    x_4.set_eval(true) ;
    x_4.compile() ;
      scanner.setSource(x_4.scanner) ;
if  (att_eval)      action_tds2_2(x_4, x_6);
    x_6.analyser() ;
if  (att_eval)      action_gen_2(x_4, x_6);
  }
private void action_tds2_2(ASM x_4, S_ENTITES_MOC x_6) throws Exception {
try {
// instructions
System.out.print(""+"; tds:\n"+glob_2_t);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds2","ENTITES -> asm #tds ASM #tds2 ENTITES1 #gen ;"});
}
  }
private void action_gen_3(S_FONCTION_MOC x_2, S_ENTITES_MOC x_3) throws Exception {
try {
// instructions
this.att_code=x_2.att_code+x_3.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","ENTITES -> FONCTION ENTITES1 #gen ;"});
}
  }
private void action_gen_1() throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","ENTITES -> #gen ;"});
}
  }
private void action_gen_2(ASM x_4, S_ENTITES_MOC x_6) throws Exception {
try {
// instructions
this.att_code=x_4.att_code_asm+x_6.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","ENTITES -> asm #tds ASM #tds2 ENTITES1 #gen ;"});
}
  }
private void action_tds_2(ASM x_4, S_ENTITES_MOC x_6) throws Exception {
try {
// instructions
glob_2_t= new TDS(this.att_tds);
x_4.att_tds_asm=glob_2_t;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds","ENTITES -> asm #tds ASM #tds2 ENTITES1 #gen ;"});
}
  }
private void action_auto_inh_2(ASM x_4, S_ENTITES_MOC x_6) throws Exception {
try {
// instructions
x_6.att_machine=this.att_machine;
x_6.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","ENTITES -> asm #tds ASM #tds2 ENTITES1 #gen ;"});
}
  }
private void action_auto_inh_3(S_FONCTION_MOC x_2, S_ENTITES_MOC x_3) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_3.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","ENTITES -> FONCTION ENTITES1 #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.EOF :
        regle1 () ;
      break ;
      case LEX_MOC.token_asm : // 36
        regle2 () ;
      break ;
      case LEX_MOC.token_void : // 35
        regle3 () ;
      break ;
      case LEX_MOC.token_int : // 37
        regle3 () ;
      break ;
      case LEX_MOC.token_char : // 38
        regle3 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
