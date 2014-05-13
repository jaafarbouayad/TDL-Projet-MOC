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
public class S_PROGRAMME_MOC {
LEX_MOC scanner;
  S_PROGRAMME_MOC() {
    }
  S_PROGRAMME_MOC(LEX_MOC scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  MOCSourceFile att_source;
  boolean att_eval;
  LEX_MOC att_scanner;
  IMachine glob_0_machine;
  private void regle0() throws Exception {

    //declaration
    S_ENTITES_MOC x_4 = new S_ENTITES_MOC(scanner,att_eval) ;
    //appel
if  (att_eval)      action_init_0(x_4);
if  (att_eval)      action_tds_0(x_4);
    x_4.analyser() ;
if  (att_eval)      action_gen_0(x_4);
  }
private void action_gen_0(S_ENTITES_MOC x_4) throws Exception {
try {
// locales
String loc_machine_code;
// instructions
loc_machine_code="\n; [PROGRAMME -> #init #tds ENTITES #gen] code \n"+x_4.att_code+"; end [PROGRAMME -> #init #tds ENTITES #gen] code \n\n";
glob_0_machine.writeCode(this.att_source.getFileName(), loc_machine_code);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#gen","PROGRAMME -> #init #tds ENTITES #gen ;"});
}
  }
private void action_tds_0(S_ENTITES_MOC x_4) throws Exception {
try {
// instructions
x_4.att_tds=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#tds","PROGRAMME -> #init #tds ENTITES #gen ;"});
}
  }
private void action_init_0(S_ENTITES_MOC x_4) throws Exception {
try {
// locales
// instructions
glob_0_machine=this.att_source.getMachine();
if (glob_0_machine==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMOCMessages.id_NO_MACH, MOCMessages.NO_MACH,new Object[]{""+this.att_source.getMachName()});

}
else {
x_4.att_machine=glob_0_machine;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MOC", "#init","PROGRAMME -> #init #tds ENTITES #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MOC.token_asm : // 36
        regle0 () ;
      break ;
      case LEX_MOC.token_void : // 35
        regle0 () ;
      break ;
      case LEX_MOC.token_int : // 37
        regle0 () ;
      break ;
      case LEX_MOC.token_char : // 38
        regle0 () ;
      break ;
      case LEX_MOC.EOF :
        regle0 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMOCMessages.id_MOC_unexpected_token,MOCMessages.MOC_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
