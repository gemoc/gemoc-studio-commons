/*
 * generated by Xtext 2.14.0
 */
package org.eclipse.gemoc.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.services.DslGrammarAccess;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class DslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Dsl_SPACETerminalRuleCall_3_a;
	protected AbstractElementAlias match_Dsl_SPACETerminalRuleCall_5_2_a;
	protected AbstractElementAlias match_Dsl___CarriageReturnKeyword_5_0_0_q_LineFeedKeyword_5_0_1__p;
	protected AbstractElementAlias match_Dsl___CarriageReturnKeyword_6_0_q_LineFeedKeyword_6_1_____CarriageReturnKeyword_6_2_1_0_q_LineFeedKeyword_6_2_1_1__q___SPACETerminalRuleCall_6_2_0_0_p_CarriageReturnKeyword_6_2_0_1_q_LineFeedKeyword_6_2_0_2__q__p__q;
	protected AbstractElementAlias match_Dsl___SL_COMMENTTerminalRuleCall_2_0___CarriageReturnKeyword_2_1_0_q_LineFeedKeyword_2_1_1__p__a;
	protected AbstractElementAlias match_Dsl___SPACETerminalRuleCall_5_1_0_p_CarriageReturnKeyword_5_1_1_q_LineFeedKeyword_5_1_2__a;
	protected AbstractElementAlias match_Dsl_____CarriageReturnKeyword_1_1_0_q_LineFeedKeyword_1_1_1__q___SPACETerminalRuleCall_1_0_0_p_CarriageReturnKeyword_1_0_1_q_LineFeedKeyword_1_0_2__q__p;
	protected AbstractElementAlias match_Entry_SPACETerminalRuleCall_2_a;
	protected AbstractElementAlias match_Entry_SPACETerminalRuleCall_3_1_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DslGrammarAccess) access;
		match_Dsl_SPACETerminalRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getDslAccess().getSPACETerminalRuleCall_3());
		match_Dsl_SPACETerminalRuleCall_5_2_a = new TokenAlias(true, true, grammarAccess.getDslAccess().getSPACETerminalRuleCall_5_2());
		match_Dsl___CarriageReturnKeyword_5_0_0_q_LineFeedKeyword_5_0_1__p = new GroupAlias(true, false, new TokenAlias(false, true, grammarAccess.getDslAccess().getCarriageReturnKeyword_5_0_0()), new TokenAlias(false, false, grammarAccess.getDslAccess().getLineFeedKeyword_5_0_1()));
		match_Dsl___CarriageReturnKeyword_6_0_q_LineFeedKeyword_6_1_____CarriageReturnKeyword_6_2_1_0_q_LineFeedKeyword_6_2_1_1__q___SPACETerminalRuleCall_6_2_0_0_p_CarriageReturnKeyword_6_2_0_1_q_LineFeedKeyword_6_2_0_2__q__p__q = new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getDslAccess().getCarriageReturnKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getDslAccess().getLineFeedKeyword_6_1()), new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getDslAccess().getCarriageReturnKeyword_6_2_1_0()), new TokenAlias(false, false, grammarAccess.getDslAccess().getLineFeedKeyword_6_2_1_1())), new GroupAlias(false, true, new TokenAlias(true, false, grammarAccess.getDslAccess().getSPACETerminalRuleCall_6_2_0_0()), new TokenAlias(false, true, grammarAccess.getDslAccess().getCarriageReturnKeyword_6_2_0_1()), new TokenAlias(false, false, grammarAccess.getDslAccess().getLineFeedKeyword_6_2_0_2()))));
		match_Dsl___SL_COMMENTTerminalRuleCall_2_0___CarriageReturnKeyword_2_1_0_q_LineFeedKeyword_2_1_1__p__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getDslAccess().getSL_COMMENTTerminalRuleCall_2_0()), new GroupAlias(true, false, new TokenAlias(false, true, grammarAccess.getDslAccess().getCarriageReturnKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getDslAccess().getLineFeedKeyword_2_1_1())));
		match_Dsl___SPACETerminalRuleCall_5_1_0_p_CarriageReturnKeyword_5_1_1_q_LineFeedKeyword_5_1_2__a = new GroupAlias(true, true, new TokenAlias(true, false, grammarAccess.getDslAccess().getSPACETerminalRuleCall_5_1_0()), new TokenAlias(false, true, grammarAccess.getDslAccess().getCarriageReturnKeyword_5_1_1()), new TokenAlias(false, false, grammarAccess.getDslAccess().getLineFeedKeyword_5_1_2()));
		match_Dsl_____CarriageReturnKeyword_1_1_0_q_LineFeedKeyword_1_1_1__q___SPACETerminalRuleCall_1_0_0_p_CarriageReturnKeyword_1_0_1_q_LineFeedKeyword_1_0_2__q__p = new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getDslAccess().getCarriageReturnKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getDslAccess().getLineFeedKeyword_1_1_1())), new GroupAlias(false, true, new TokenAlias(true, false, grammarAccess.getDslAccess().getSPACETerminalRuleCall_1_0_0()), new TokenAlias(false, true, grammarAccess.getDslAccess().getCarriageReturnKeyword_1_0_1()), new TokenAlias(false, false, grammarAccess.getDslAccess().getLineFeedKeyword_1_0_2())));
		match_Entry_SPACETerminalRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getEntryAccess().getSPACETerminalRuleCall_2());
		match_Entry_SPACETerminalRuleCall_3_1_a = new TokenAlias(true, true, grammarAccess.getEntryAccess().getSPACETerminalRuleCall_3_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getSEPARATORRule())
			return getSEPARATORToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSL_COMMENTRule())
			return getSL_COMMENTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSPACERule())
			return getSPACEToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal SEPARATOR:
	 * 	'=' | ':'
	 * ;
	 */
	protected String getSEPARATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	/**
	 * terminal SL_COMMENT :
	 * 	('!' | '#') !('\n'|'\r')* ('\r'? '\n')?
	 * ;
	 */
	protected String getSL_COMMENTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "!";
	}
	
	/**
	 * terminal SPACE:
	 * 	' '|'\t'
	 * ;
	 */
	protected String getSPACEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Dsl_SPACETerminalRuleCall_3_a.equals(syntax))
				emit_Dsl_SPACETerminalRuleCall_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Dsl_SPACETerminalRuleCall_5_2_a.equals(syntax))
				emit_Dsl_SPACETerminalRuleCall_5_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Dsl___CarriageReturnKeyword_5_0_0_q_LineFeedKeyword_5_0_1__p.equals(syntax))
				emit_Dsl___CarriageReturnKeyword_5_0_0_q_LineFeedKeyword_5_0_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Dsl___CarriageReturnKeyword_6_0_q_LineFeedKeyword_6_1_____CarriageReturnKeyword_6_2_1_0_q_LineFeedKeyword_6_2_1_1__q___SPACETerminalRuleCall_6_2_0_0_p_CarriageReturnKeyword_6_2_0_1_q_LineFeedKeyword_6_2_0_2__q__p__q.equals(syntax))
				emit_Dsl___CarriageReturnKeyword_6_0_q_LineFeedKeyword_6_1_____CarriageReturnKeyword_6_2_1_0_q_LineFeedKeyword_6_2_1_1__q___SPACETerminalRuleCall_6_2_0_0_p_CarriageReturnKeyword_6_2_0_1_q_LineFeedKeyword_6_2_0_2__q__p__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Dsl___SL_COMMENTTerminalRuleCall_2_0___CarriageReturnKeyword_2_1_0_q_LineFeedKeyword_2_1_1__p__a.equals(syntax))
				emit_Dsl___SL_COMMENTTerminalRuleCall_2_0___CarriageReturnKeyword_2_1_0_q_LineFeedKeyword_2_1_1__p__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Dsl___SPACETerminalRuleCall_5_1_0_p_CarriageReturnKeyword_5_1_1_q_LineFeedKeyword_5_1_2__a.equals(syntax))
				emit_Dsl___SPACETerminalRuleCall_5_1_0_p_CarriageReturnKeyword_5_1_1_q_LineFeedKeyword_5_1_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Dsl_____CarriageReturnKeyword_1_1_0_q_LineFeedKeyword_1_1_1__q___SPACETerminalRuleCall_1_0_0_p_CarriageReturnKeyword_1_0_1_q_LineFeedKeyword_1_0_2__q__p.equals(syntax))
				emit_Dsl_____CarriageReturnKeyword_1_1_0_q_LineFeedKeyword_1_1_1__q___SPACETerminalRuleCall_1_0_0_p_CarriageReturnKeyword_1_0_1_q_LineFeedKeyword_1_0_2__q__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entry_SPACETerminalRuleCall_2_a.equals(syntax))
				emit_Entry_SPACETerminalRuleCall_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entry_SPACETerminalRuleCall_3_1_a.equals(syntax))
				emit_Entry_SPACETerminalRuleCall_3_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     SPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     (
	 *         (rule start) 
	 *         (
	 *             (
	 *                 '
	 '? 
	 *                 '
	 *                 '
	 *             )? 
	 *             (
	 *                 SPACE+ 
	 *                 '
	 '? 
	 *                 '
	 *                 '
	 *             )?
	 *         )+ 
	 *         (
	 *             SL_COMMENT 
	 *             (
	 *                 '
	 '? 
	 *                 '
	 *                 '
	 *             )+
	 *         )* 
	 *         (ambiguity) 
	 *         entries+=Entry
	 *     )
	 */
	protected void emit_Dsl_SPACETerminalRuleCall_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     (
	 *         entries+=Entry 
	 *         (
	 *             '
	 '? 
	 *             '
	 *             '
	 *         )+ 
	 *         (
	 *             SPACE+ 
	 *             '
	 '? 
	 *             '
	 *             '
	 *         )* 
	 *         (ambiguity) 
	 *         entries+=Entry
	 *     )
	 */
	protected void emit_Dsl_SPACETerminalRuleCall_5_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         '
	 '? 
	  *         '
	  *         '
	  *     )+
	 *
	 * This ambiguous syntax occurs at:
	 *     (
	 *         entries+=Entry 
	 *         (ambiguity) 
	 *         (
	 *             SPACE+ 
	 *             '
	 '? 
	 *             '
	 *             '
	 *         )* 
	 *         SPACE* 
	 *         entries+=Entry
	 *     )
	 */
	protected void emit_Dsl___CarriageReturnKeyword_5_0_0_q_LineFeedKeyword_5_0_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         '
	 '? 
	  *         '
	  *         ' 
	  *         (
	  *             (
	  *                 '
	 '? 
	  *                 '
	  *                 '
	  *             )? 
	  *             (
	  *                 SPACE+ 
	  *                 '
	 '? 
	  *                 '
	  *                 '
	  *             )?
	  *         )+
	  *     )?
	 *
	 * This ambiguous syntax occurs at:
	 *     entries+=Entry (ambiguity) (rule end)
	 */
	protected void emit_Dsl___CarriageReturnKeyword_6_0_q_LineFeedKeyword_6_1_____CarriageReturnKeyword_6_2_1_0_q_LineFeedKeyword_6_2_1_1__q___SPACETerminalRuleCall_6_2_0_0_p_CarriageReturnKeyword_6_2_0_1_q_LineFeedKeyword_6_2_0_2__q__p__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         SL_COMMENT 
	  *         (
	  *             '
	 '? 
	  *             '
	  *             '
	  *         )+
	  *     )*
	 *
	 * This ambiguous syntax occurs at:
	 *     (
	 *         (rule start) 
	 *         (
	 *             (
	 *                 '
	 '? 
	 *                 '
	 *                 '
	 *             )? 
	 *             (
	 *                 SPACE+ 
	 *                 '
	 '? 
	 *                 '
	 *                 '
	 *             )?
	 *         )+ 
	 *         (ambiguity) 
	 *         SPACE* 
	 *         entries+=Entry
	 *     )
	 */
	protected void emit_Dsl___SL_COMMENTTerminalRuleCall_2_0___CarriageReturnKeyword_2_1_0_q_LineFeedKeyword_2_1_1__p__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         SPACE+ 
	  *         '
	 '? 
	  *         '
	  *         '
	  *     )*
	 *
	 * This ambiguous syntax occurs at:
	 *     (
	 *         entries+=Entry 
	 *         (
	 *             '
	 '? 
	 *             '
	 *             '
	 *         )+ 
	 *         (ambiguity) 
	 *         SPACE* 
	 *         entries+=Entry
	 *     )
	 */
	protected void emit_Dsl___SPACETerminalRuleCall_5_1_0_p_CarriageReturnKeyword_5_1_1_q_LineFeedKeyword_5_1_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         (
	  *             '
	 '? 
	  *             '
	  *             '
	  *         )? 
	  *         (
	  *             SPACE+ 
	  *             '
	 '? 
	  *             '
	  *             '
	  *         )?
	  *     )+
	 *
	 * This ambiguous syntax occurs at:
	 *     (
	 *         (rule start) 
	 *         (ambiguity) 
	 *         (
	 *             SL_COMMENT 
	 *             (
	 *                 '
	 '? 
	 *                 '
	 *                 '
	 *             )+
	 *         )* 
	 *         SPACE* 
	 *         entries+=Entry
	 *     )
	 */
	protected void emit_Dsl_____CarriageReturnKeyword_1_1_0_q_LineFeedKeyword_1_1_1__q___SPACETerminalRuleCall_1_0_0_p_CarriageReturnKeyword_1_0_1_q_LineFeedKeyword_1_0_2__q__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     key=WORD (ambiguity) SEPARATOR SPACE* value=MULTILINE
	 */
	protected void emit_Entry_SPACETerminalRuleCall_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     key=WORD SPACE* SEPARATOR (ambiguity) value=MULTILINE
	 */
	protected void emit_Entry_SPACETerminalRuleCall_3_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
