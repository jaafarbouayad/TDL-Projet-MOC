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
public class S_SIX_MOC {
LEX_MOC scanner;
  S_SIX_MOC() {
    }
  S_SIX_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MOC att_scanner;
  private void regle23() throws Exception {

    //declaration
    T_MOC x_2 = new T_MOC(scanner ) ;
    S_BLOC_MOC x_4 = new S_BLOC_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_23(x_4);
    x_2.analyser(LEX_MOC.token_sinon);
if  (att_eval)      action_tds_23(x_4);
    x_4.analyser() ;
  }
  private void regle24() throws Exception {

    //declaration
    //appel
  }
private void action_tds_23(S_BLOC_MOC x_4) throws Exception {
try {
// instructions
x_4.att_tds=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds","SIX -> sinon #tds BLOC ;"});
}
  }
private void action_auto_inh_23(S_BLOC_MOC x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#auto_inh","SIX -> sinon #tds BLOC ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_sinon : // 34
        regle23 () ;
      break ;
      case LEX_MOC.token_void : // 35
        regle24 () ;
      break ;
      case LEX_MOC.token_int : // 37
        regle24 () ;
      break ;
      case LEX_MOC.token_char : // 38
        regle24 () ;
      break ;
      case LEX_MOC.token_entier : // 56
        regle24 () ;
      break ;
      case LEX_MOC.token_chaine : // 58
        regle24 () ;
      break ;
      case LEX_MOC.token_caractere : // 57
        regle24 () ;
      break ;
      case LEX_MOC.token_plus : // 48
        regle24 () ;
      break ;
      case LEX_MOC.token_moins : // 49
        regle24 () ;
      break ;
      case LEX_MOC.token_non : // 55
        regle24 () ;
      break ;
      case LEX_MOC.token_null : // 40
        regle24 () ;
      break ;
      case LEX_MOC.token_paro : // 26
        regle24 () ;
      break ;
      case LEX_MOC.token_ident : // 59
        regle24 () ;
      break ;
      case LEX_MOC.token_mult : // 51
        regle24 () ;
      break ;
      case LEX_MOC.token_aco : // 28
        regle24 () ;
      break ;
      case LEX_MOC.token_si : // 33
        regle24 () ;
      break ;
      case LEX_MOC.token_retour : // 39
        regle24 () ;
      break ;
      case LEX_MOC.token_asm : // 36
        regle24 () ;
      break ;
      case LEX_MOC.token_acf : // 29
        regle24 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
