

/* First created by JCasGen Wed Sep 11 21:11:02 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Wed Sep 11 21:11:02 EDT 2013
 * XML source: C:/Users/sy/git/hw1-yis1/hw1-yis1/src/main/resources/hw1-yis1-typesystem.xml
 * @generated */
public class AnswerScoreAnnotation extends TokenAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerScoreAnnotation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected AnswerScoreAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnswerScoreAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnswerScoreAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AnswerScoreAnnotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets 
   * @generated */
  public double getScore() {
    if (AnswerScoreAnnotation_Type.featOkTst && ((AnswerScoreAnnotation_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "AnswerScoreAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((AnswerScoreAnnotation_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets  
   * @generated */
  public void setScore(double v) {
    if (AnswerScoreAnnotation_Type.featOkTst && ((AnswerScoreAnnotation_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "AnswerScoreAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((AnswerScoreAnnotation_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: answer

  /** getter for answer - gets 
   * @generated */
  public AnswerAnnotation getAnswer() {
    if (AnswerScoreAnnotation_Type.featOkTst && ((AnswerScoreAnnotation_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "AnswerScoreAnnotation");
    return (AnswerAnnotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerScoreAnnotation_Type)jcasType).casFeatCode_answer)));}
    
  /** setter for answer - sets  
   * @generated */
  public void setAnswer(AnswerAnnotation v) {
    if (AnswerScoreAnnotation_Type.featOkTst && ((AnswerScoreAnnotation_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "AnswerScoreAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerScoreAnnotation_Type)jcasType).casFeatCode_answer, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    