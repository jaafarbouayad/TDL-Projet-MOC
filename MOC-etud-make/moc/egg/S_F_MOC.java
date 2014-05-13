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
public class S_F_MOC {
LEX_MOC scanner;
  S_F_MOC() {
    }
  S_F_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MOC att_scanner;
  private void regle62() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    T_MOC x_3 = new T_MOC(scanner ) ;
    S_ARGS_MOC x_4 = new S_ARGS_MOC(scanner,att_eval) ;
    T_MOC x_5 = new T_MOC(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_62(x_2, x_4);
    x_2.analyser(LEX_MOC.token_ident);
    x_3.analyser(LEX_MOC.token_paro);
    x_4.analyser() ;
    x_5.analyser(LEX_MOC.token_parf);
  }
  private void regle63() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_ident);
  }
  private void regle60() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    S_E_MOC x_3 = new S_E_MOC(scanner,att_eval) ;
    T_MOC x_4 = new T_MOC(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_60(x_3);
    x_2.analyser(LEX_MOC.token_paro);
    x_3.analyser() ;
    x_4.analyser(LEX_MOC.token_parf);
  }
  private void regle61() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    S_TYPE_MOC x_4 = new S_TYPE_MOC(scanner,att_eval) ;
    T_MOC x_5 = new T_MOC(scanner ) ;
    S_F_MOC x_6 = new S_F_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_61(x_4, x_6);
    x_2.analyser(LEX_MOC.token_paro);
if  (att_eval)      action_tds_61(x_4, x_6);
    x_4.analyser() ;
    x_5.analyser(LEX_MOC.token_parf);
    x_6.analyser() ;
  }
  private void regle64() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    S_F_MOC x_3 = new S_F_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_64(x_3);
    x_2.analyser(LEX_MOC.token_mult);
    x_3.analyser() ;
  }
  private void regle59() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_null);
  }
  private void regle54() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_caractere);
  }
  private void regle53() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_chaine);
  }
  private void regle55() throws Exception {

    //declaration
    S_OPUN_MOC x_2 = new S_OPUN_MOC(scanner,att_eval) ;
    S_F_MOC x_3 = new S_F_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_55(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
  }
  private void regle52() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    //appel
    x_2.analyser(LEX_MOC.token_entier);
  }
private void action_auto_inh_62(T_MOC x_2, S_ARGS_MOC x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","F -> ident paro ARGS parf ;"});
}
  }
private void action_auto_inh_64(S_F_MOC x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","F -> mult F1 ;"});
}
  }
private void action_tds_61(S_TYPE_MOC x_4, S_F_MOC x_6) throws Exception {
try {
// instructions
x_4.att_tds=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds","F -> paro #tds TYPE parf F1 ;"});
}
  }
private void action_auto_inh_55(S_OPUN_MOC x_2, S_F_MOC x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","F -> OPUN F1 ;"});
}
  }
private void action_auto_inh_61(S_TYPE_MOC x_4, S_F_MOC x_6) throws Exception {
try {
// instructions
x_6.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","F -> paro #tds TYPE parf F1 ;"});
}
  }
private void action_auto_inh_60(S_E_MOC x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","F -> paro E parf ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_entier : // 56
        regle52 () ;
      break ;
      case LEX_MOC.token_chaine : // 58
        regle53 () ;
      break ;
      case LEX_MOC.token_caractere : // 57
        regle54 () ;
      break ;
      case LEX_MOC.token_plus : // 48
        regle55 () ;
      break ;
      case LEX_MOC.token_moins : // 49
        regle55 () ;
      break ;
      case LEX_MOC.token_non : // 55
        regle55 () ;
      break ;
      case LEX_MOC.token_null : // 40
        regle59 () ;
      break ;
      case LEX_MOC.token_paro : // 26
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MOC.token_entier : // 56
            regle60 () ;
          break ;
          case LEX_MOC.token_chaine : // 58
            regle60 () ;
          break ;
          case LEX_MOC.token_caractere : // 57
            regle60 () ;
          break ;
          case LEX_MOC.token_plus : // 48
            regle60 () ;
          break ;
          case LEX_MOC.token_moins : // 49
            regle60 () ;
          break ;
          case LEX_MOC.token_non : // 55
            regle60 () ;
          break ;
          case LEX_MOC.token_null : // 40
            regle60 () ;
          break ;
          case LEX_MOC.token_paro : // 26
            regle60 () ;
          break ;
          case LEX_MOC.token_ident : // 59
            regle60 () ;
          break ;
          case LEX_MOC.token_mult : // 51
            regle60 () ;
          break ;
          case LEX_MOC.token_void : // 35
            regle61 () ;
          break ;
          case LEX_MOC.token_int : // 37
            regle61 () ;
          break ;
          case LEX_MOC.token_char : // 38
            regle61 () ;
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MOC.token_paro);
        }
      break ;
      case LEX_MOC.token_ident : // 59
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MOC.token_paro : // 26
            regle62 () ;
          break ;
          case LEX_MOC.token_mult : // 51
            regle63 () ;
          break ;
          case LEX_MOC.token_div : // 52
            regle63 () ;
          break ;
          case LEX_MOC.token_mod : // 53
            regle63 () ;
          break ;
          case LEX_MOC.token_et : // 54
            regle63 () ;
          break ;
          case LEX_MOC.token_plus : // 48
            regle63 () ;
          break ;
          case LEX_MOC.token_moins : // 49
            regle63 () ;
          break ;
          case LEX_MOC.token_ou : // 50
            regle63 () ;
          break ;
          case LEX_MOC.token_inf : // 42
            regle63 () ;
          break ;
          case LEX_MOC.token_sup : // 44
            regle63 () ;
          break ;
          case LEX_MOC.token_infeg : // 43
            regle63 () ;
          break ;
          case LEX_MOC.token_supeg : // 45
            regle63 () ;
          break ;
          case LEX_MOC.token_eg : // 46
            regle63 () ;
          break ;
          case LEX_MOC.token_neg : // 47
            regle63 () ;
          break ;
          case LEX_MOC.token_affect : // 32
            regle63 () ;
          break ;
          case LEX_MOC.token_virg : // 30
            regle63 () ;
          break ;
          case LEX_MOC.token_parf : // 27
            regle63 () ;
          break ;
          case LEX_MOC.token_pv : // 31
            regle63 () ;
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MOC.token_ident);
        }
      break ;
      case LEX_MOC.token_mult : // 51
        regle64 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
