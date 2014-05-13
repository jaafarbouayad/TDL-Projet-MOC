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
public class S_INST_MOC {
LEX_MOC scanner;
  S_INST_MOC() {
    }
  S_INST_MOC(LEX_MOC scanner, boolean eval) {
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
  private void regle26() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    ASM x_4 = new ASM(scanner.getReporter(), scanner.contexte);
    //appel
    x_2.analyser(LEX_MOC.token_asm);
if  (att_eval)      action_tds_26(x_4);
    x_4.scanner.setSource(scanner) ;
    x_4.set_eval(true) ;
    x_4.compile() ;
      scanner.setSource(x_4.scanner) ;
if  (att_eval)      action_gen_26(x_4);
  }
  private void regle25() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    S_E_MOC x_3 = new S_E_MOC(scanner,att_eval) ;
    T_MOC x_4 = new T_MOC(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_25(x_3);
    x_2.analyser(LEX_MOC.token_retour);
    x_3.analyser() ;
    x_4.analyser(LEX_MOC.token_pv);
if  (att_eval)      action_gen_25(x_3);
  }
  private void regle19() throws Exception {

    //declaration
    S_TYPE_MOC x_2 = new S_TYPE_MOC(scanner,att_eval) ;
    T_MOC x_3 = new T_MOC(scanner ) ;
    S_AFFX_MOC x_4 = new S_AFFX_MOC(scanner,att_eval) ;
    T_MOC x_5 = new T_MOC(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_19(x_2, x_3, x_4);
    x_2.analyser() ;
    x_3.analyser(LEX_MOC.token_ident);
    x_4.analyser() ;
    x_5.analyser(LEX_MOC.token_pv);
if  (att_eval)      action_gen_19(x_2, x_3, x_4);
  }
  private void regle22() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    T_MOC x_3 = new T_MOC(scanner ) ;
    S_E_MOC x_4 = new S_E_MOC(scanner,att_eval) ;
    T_MOC x_5 = new T_MOC(scanner ) ;
    S_BLOC_MOC x_7 = new S_BLOC_MOC(scanner,att_eval) ;
    S_SIX_MOC x_8 = new S_SIX_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_22(x_4, x_7, x_8);
    x_2.analyser(LEX_MOC.token_si);
    x_3.analyser(LEX_MOC.token_paro);
    x_4.analyser() ;
    x_5.analyser(LEX_MOC.token_parf);
if  (att_eval)      action_tds_22(x_4, x_7, x_8);
    x_7.analyser() ;
    x_8.analyser() ;
if  (att_eval)      action_gen_22(x_4, x_7, x_8);
  }
  private void regle20() throws Exception {

    //declaration
    S_E_MOC x_2 = new S_E_MOC(scanner,att_eval) ;
    T_MOC x_3 = new T_MOC(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_20(x_2);
    x_2.analyser() ;
    x_3.analyser(LEX_MOC.token_pv);
if  (att_eval)      action_gen_20(x_2);
  }
  private void regle21() throws Exception {

    //declaration
    S_BLOC_MOC x_3 = new S_BLOC_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_21(x_3);
if  (att_eval)      action_tds_21(x_3);
    x_3.analyser() ;
if  (att_eval)      action_gen_21(x_3);
  }
private void action_gen_19(S_TYPE_MOC x_2, T_MOC x_3, S_AFFX_MOC x_4) throws Exception {
try {
// locales
INFO loc_i;
// instructions
loc_i=this.att_tds.chercherGlobalement(x_3.att_txt);
if (loc_i!=null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_B_00, MOCMessages.B_00,new Object[]{""+x_3.att_txt});

}
else {
this.att_tds.inserer(x_3.att_txt, loc_i);
this.att_code="";
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","INST -> TYPE ident AFFX pv #gen ;"});
}
  }
private void action_tds_26(ASM x_4) throws Exception {
try {
// instructions
x_4.att_tds_asm=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds","INST -> asm #tds ASM #gen ;"});
}
  }
private void action_gen_20(S_E_MOC x_2) throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","INST -> E pv #gen ;"});
}
  }
private void action_auto_inh_19(S_TYPE_MOC x_2, T_MOC x_3, S_AFFX_MOC x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_2.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","INST -> TYPE ident AFFX pv #gen ;"});
}
  }
private void action_gen_21(S_BLOC_MOC x_3) throws Exception {
try {
// instructions
this.att_code=x_3.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","INST -> #tds BLOC #gen ;"});
}
  }
private void action_gen_22(S_E_MOC x_4, S_BLOC_MOC x_7, S_SIX_MOC x_8) throws Exception {
try {
// instructions
this.att_code=x_7.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","INST -> si paro E parf #tds BLOC SIX #gen ;"});
}
  }
private void action_tds_22(S_E_MOC x_4, S_BLOC_MOC x_7, S_SIX_MOC x_8) throws Exception {
try {
// instructions
x_7.att_tds=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds","INST -> si paro E parf #tds BLOC SIX #gen ;"});
}
  }
private void action_auto_inh_20(S_E_MOC x_2) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","INST -> E pv #gen ;"});
}
  }
private void action_auto_inh_21(S_BLOC_MOC x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","INST -> #tds BLOC #gen ;"});
}
  }
private void action_gen_26(ASM x_4) throws Exception {
try {
// instructions
this.att_code=x_4.att_code_asm;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","INST -> asm #tds ASM #gen ;"});
}
  }
private void action_gen_25(S_E_MOC x_3) throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","INST -> retour E pv #gen ;"});
}
  }
private void action_auto_inh_25(S_E_MOC x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","INST -> retour E pv #gen ;"});
}
  }
private void action_auto_inh_22(S_E_MOC x_4, S_BLOC_MOC x_7, S_SIX_MOC x_8) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_7.att_machine=this.att_machine;
x_8.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","INST -> si paro E parf #tds BLOC SIX #gen ;"});
}
  }
private void action_tds_21(S_BLOC_MOC x_3) throws Exception {
try {
// instructions
x_3.att_tds=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds","INST -> #tds BLOC #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_void : // 35
        regle19 () ;
      break ;
      case LEX_MOC.token_int : // 37
        regle19 () ;
      break ;
      case LEX_MOC.token_char : // 38
        regle19 () ;
      break ;
      case LEX_MOC.token_entier : // 56
        regle20 () ;
      break ;
      case LEX_MOC.token_chaine : // 58
        regle20 () ;
      break ;
      case LEX_MOC.token_caractere : // 57
        regle20 () ;
      break ;
      case LEX_MOC.token_plus : // 48
        regle20 () ;
      break ;
      case LEX_MOC.token_moins : // 49
        regle20 () ;
      break ;
      case LEX_MOC.token_non : // 55
        regle20 () ;
      break ;
      case LEX_MOC.token_null : // 40
        regle20 () ;
      break ;
      case LEX_MOC.token_paro : // 26
        regle20 () ;
      break ;
      case LEX_MOC.token_ident : // 59
        regle20 () ;
      break ;
      case LEX_MOC.token_mult : // 51
        regle20 () ;
      break ;
      case LEX_MOC.token_aco : // 28
        regle21 () ;
      break ;
      case LEX_MOC.token_si : // 33
        regle22 () ;
      break ;
      case LEX_MOC.token_retour : // 39
        regle25 () ;
      break ;
      case LEX_MOC.token_asm : // 36
        regle26 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
