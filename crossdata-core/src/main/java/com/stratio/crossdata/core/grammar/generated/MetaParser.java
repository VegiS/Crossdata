// $ANTLR 3.5.2 Meta.g 2014-10-21 17:09:07

    package com.stratio.crossdata.core.grammar.generated;
    import com.stratio.crossdata.common.data.*;
    import com.stratio.crossdata.common.statements.structures.selectors.*;
    import com.stratio.crossdata.common.statements.structures.relationships.*;
    import com.stratio.crossdata.common.statements.structures.window.*;
    import com.stratio.crossdata.core.statements.*;
    import com.stratio.crossdata.core.structures.*;
    import com.stratio.crossdata.core.structures.*;
    import com.stratio.crossdata.core.utils.*;
    import com.stratio.crossdata.common.metadata.*;
    import com.stratio.crossdata.common.metadata.structures.*;
    import java.util.LinkedHashMap;
    import java.util.LinkedList;
    import java.util.Map;
    import java.util.Set;
    import java.util.HashSet;
    import org.apache.commons.lang3.tuple.MutablePair;
    import com.stratio.crossdata.common.exceptions.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MetaParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "B", "C", "D", "DIGIT", "E", 
		"EXPONENT", "F", "G", "H", "I", "J", "K", "L", "LETTER", "M", "N", "O", 
		"P", "POINT", "Q", "QUOTED_LITERAL", "R", "S", "T", "T_ADD", "T_AGGREGATION", 
		"T_ALL", "T_ALTER", "T_ANALYTICS", "T_AND", "T_ANY", "T_AS", "T_ASC", 
		"T_ASTERISK", "T_AT", "T_ATTACH", "T_AVG", "T_BETWEEN", "T_BIGINT", "T_BOOLEAN", 
		"T_BY", "T_CATALOG", "T_CATALOGS", "T_CLUSTER", "T_CLUSTERING", "T_CLUSTERS", 
		"T_COLON", "T_COMMA", "T_COMPACT", "T_CONNECTOR", "T_CONNECTORS", "T_CONSISTENCY", 
		"T_CONSTANT", "T_COUNT", "T_CREATE", "T_CTLG_TBL_COL", "T_CUSTOM", "T_DATASTORE", 
		"T_DATASTORES", "T_DAY", "T_DAYS", "T_DEFAULT", "T_DELETE", "T_DESC", 
		"T_DESCRIBE", "T_DETACH", "T_DISABLE", "T_DISTINCT", "T_DOUBLE", "T_DROP", 
		"T_EACH_QUORUM", "T_END_BRACKET", "T_END_PARENTHESIS", "T_END_SBRACKET", 
		"T_EPHEMERAL", "T_EQUAL", "T_EXISTS", "T_EXPLAIN", "T_FALSE", "T_FLOAT", 
		"T_FOR", "T_FROM", "T_FULL_TEXT", "T_GROUP", "T_GT", "T_GTE", "T_HOUR", 
		"T_HOURS", "T_IDENT", "T_IF", "T_IN", "T_INDEX", "T_INNER", "T_INSERT", 
		"T_INT", "T_INTEGER", "T_INTERROGATION", "T_INTO", "T_JOIN", "T_KEY", 
		"T_KEYSPACE", "T_KEYSPACES", "T_KS_AND_TN", "T_LAST", "T_LIKE", "T_LIMIT", 
		"T_LIST", "T_LOCAL_ONE", "T_LOCAL_QUORUM", "T_LT", "T_LTE", "T_LUCENE", 
		"T_MAP", "T_MATCH", "T_MAX", "T_MIN", "T_MINS", "T_MINUTE", "T_MINUTES", 
		"T_NOT", "T_NOT_EQUAL", "T_NULL", "T_ON", "T_ONE", "T_OPTIONS", "T_ORDER", 
		"T_PLAN", "T_PLUS", "T_PRIMARY", "T_PROCESS", "T_QUORUM", "T_QUOTE", "T_REMOVE", 
		"T_ROWS", "T_SEC", "T_SECOND", "T_SECONDS", "T_SECS", "T_SELECT", "T_SEMICOLON", 
		"T_SET", "T_SINGLE_QUOTE", "T_SLASH", "T_START_BRACKET", "T_START_PARENTHESIS", 
		"T_START_SBRACKET", "T_STOP", "T_STORAGE", "T_SUBTRACT", "T_SUM", "T_TABLE", 
		"T_TABLES", "T_TERM", "T_TEXT", "T_THREE", "T_TO", "T_TOKEN", "T_TRIGGER", 
		"T_TRUE", "T_TRUNCATE", "T_TWO", "T_TYPE", "T_UDF", "T_UPDATE", "T_USE", 
		"T_USING", "T_VALUES", "T_VARCHAR", "T_WHERE", "T_WINDOW", "T_WITH", "U", 
		"V", "W", "WS", "X", "Y", "Z"
	};
	public static final int EOF=-1;
	public static final int A=4;
	public static final int B=5;
	public static final int C=6;
	public static final int D=7;
	public static final int DIGIT=8;
	public static final int E=9;
	public static final int EXPONENT=10;
	public static final int F=11;
	public static final int G=12;
	public static final int H=13;
	public static final int I=14;
	public static final int J=15;
	public static final int K=16;
	public static final int L=17;
	public static final int LETTER=18;
	public static final int M=19;
	public static final int N=20;
	public static final int O=21;
	public static final int P=22;
	public static final int POINT=23;
	public static final int Q=24;
	public static final int QUOTED_LITERAL=25;
	public static final int R=26;
	public static final int S=27;
	public static final int T=28;
	public static final int T_ADD=29;
	public static final int T_AGGREGATION=30;
	public static final int T_ALL=31;
	public static final int T_ALTER=32;
	public static final int T_ANALYTICS=33;
	public static final int T_AND=34;
	public static final int T_ANY=35;
	public static final int T_AS=36;
	public static final int T_ASC=37;
	public static final int T_ASTERISK=38;
	public static final int T_AT=39;
	public static final int T_ATTACH=40;
	public static final int T_AVG=41;
	public static final int T_BETWEEN=42;
	public static final int T_BIGINT=43;
	public static final int T_BOOLEAN=44;
	public static final int T_BY=45;
	public static final int T_CATALOG=46;
	public static final int T_CATALOGS=47;
	public static final int T_CLUSTER=48;
	public static final int T_CLUSTERING=49;
	public static final int T_CLUSTERS=50;
	public static final int T_COLON=51;
	public static final int T_COMMA=52;
	public static final int T_COMPACT=53;
	public static final int T_CONNECTOR=54;
	public static final int T_CONNECTORS=55;
	public static final int T_CONSISTENCY=56;
	public static final int T_CONSTANT=57;
	public static final int T_COUNT=58;
	public static final int T_CREATE=59;
	public static final int T_CTLG_TBL_COL=60;
	public static final int T_CUSTOM=61;
	public static final int T_DATASTORE=62;
	public static final int T_DATASTORES=63;
	public static final int T_DAY=64;
	public static final int T_DAYS=65;
	public static final int T_DEFAULT=66;
	public static final int T_DELETE=67;
	public static final int T_DESC=68;
	public static final int T_DESCRIBE=69;
	public static final int T_DETACH=70;
	public static final int T_DISABLE=71;
	public static final int T_DISTINCT=72;
	public static final int T_DOUBLE=73;
	public static final int T_DROP=74;
	public static final int T_EACH_QUORUM=75;
	public static final int T_END_BRACKET=76;
	public static final int T_END_PARENTHESIS=77;
	public static final int T_END_SBRACKET=78;
	public static final int T_EPHEMERAL=79;
	public static final int T_EQUAL=80;
	public static final int T_EXISTS=81;
	public static final int T_EXPLAIN=82;
	public static final int T_FALSE=83;
	public static final int T_FLOAT=84;
	public static final int T_FOR=85;
	public static final int T_FROM=86;
	public static final int T_FULL_TEXT=87;
	public static final int T_GROUP=88;
	public static final int T_GT=89;
	public static final int T_GTE=90;
	public static final int T_HOUR=91;
	public static final int T_HOURS=92;
	public static final int T_IDENT=93;
	public static final int T_IF=94;
	public static final int T_IN=95;
	public static final int T_INDEX=96;
	public static final int T_INNER=97;
	public static final int T_INSERT=98;
	public static final int T_INT=99;
	public static final int T_INTEGER=100;
	public static final int T_INTERROGATION=101;
	public static final int T_INTO=102;
	public static final int T_JOIN=103;
	public static final int T_KEY=104;
	public static final int T_KEYSPACE=105;
	public static final int T_KEYSPACES=106;
	public static final int T_KS_AND_TN=107;
	public static final int T_LAST=108;
	public static final int T_LIKE=109;
	public static final int T_LIMIT=110;
	public static final int T_LIST=111;
	public static final int T_LOCAL_ONE=112;
	public static final int T_LOCAL_QUORUM=113;
	public static final int T_LT=114;
	public static final int T_LTE=115;
	public static final int T_LUCENE=116;
	public static final int T_MAP=117;
	public static final int T_MATCH=118;
	public static final int T_MAX=119;
	public static final int T_MIN=120;
	public static final int T_MINS=121;
	public static final int T_MINUTE=122;
	public static final int T_MINUTES=123;
	public static final int T_NOT=124;
	public static final int T_NOT_EQUAL=125;
	public static final int T_NULL=126;
	public static final int T_ON=127;
	public static final int T_ONE=128;
	public static final int T_OPTIONS=129;
	public static final int T_ORDER=130;
	public static final int T_PLAN=131;
	public static final int T_PLUS=132;
	public static final int T_PRIMARY=133;
	public static final int T_PROCESS=134;
	public static final int T_QUORUM=135;
	public static final int T_QUOTE=136;
	public static final int T_REMOVE=137;
	public static final int T_ROWS=138;
	public static final int T_SEC=139;
	public static final int T_SECOND=140;
	public static final int T_SECONDS=141;
	public static final int T_SECS=142;
	public static final int T_SELECT=143;
	public static final int T_SEMICOLON=144;
	public static final int T_SET=145;
	public static final int T_SINGLE_QUOTE=146;
	public static final int T_SLASH=147;
	public static final int T_START_BRACKET=148;
	public static final int T_START_PARENTHESIS=149;
	public static final int T_START_SBRACKET=150;
	public static final int T_STOP=151;
	public static final int T_STORAGE=152;
	public static final int T_SUBTRACT=153;
	public static final int T_SUM=154;
	public static final int T_TABLE=155;
	public static final int T_TABLES=156;
	public static final int T_TERM=157;
	public static final int T_TEXT=158;
	public static final int T_THREE=159;
	public static final int T_TO=160;
	public static final int T_TOKEN=161;
	public static final int T_TRIGGER=162;
	public static final int T_TRUE=163;
	public static final int T_TRUNCATE=164;
	public static final int T_TWO=165;
	public static final int T_TYPE=166;
	public static final int T_UDF=167;
	public static final int T_UPDATE=168;
	public static final int T_USE=169;
	public static final int T_USING=170;
	public static final int T_VALUES=171;
	public static final int T_VARCHAR=172;
	public static final int T_WHERE=173;
	public static final int T_WINDOW=174;
	public static final int T_WITH=175;
	public static final int U=176;
	public static final int V=177;
	public static final int W=178;
	public static final int WS=179;
	public static final int X=180;
	public static final int Y=181;
	public static final int Z=182;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public MetaParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public MetaParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return MetaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Meta.g"; }



	    private String sessionCatalog = "";

	    public String getEffectiveCatalog(CatalogName cn) {
	        return ((cn != null) && (!cn.getName().isEmpty()))? cn.getName(): sessionCatalog;
	    }

	    public String getEffectiveCatalog(TableName tn) {
	        return ((tn != null) && (tn.getCatalogName()!=null) && (!tn.getCatalogName().getName().isEmpty()))? tn.getCatalogName().getName(): sessionCatalog;
	    }

	    public TableName getEffectiveTable(TableName tn) {
	        if(tn != null){
	            return new TableName(getEffectiveCatalog(tn), tn.getName());
	        }
	        return null;
	    }

	    public TableName normalizeTableName(String str){
	        if(str.contains(".")){
	            String[] idParts = str.split("\\.");
	            return new TableName(idParts[0], idParts[1]);
	        } else {
	            return new TableName(sessionCatalog, str);
	        }
	    }

	    public ColumnName normalizeColumnName(TableName tn, String str){
	        String [] columnTokens = str.split("\\.");
	        if(columnTokens.length == 1) {
	            return new ColumnName(getEffectiveTable(tn), columnTokens[0]);
	        } else if(columnTokens.length == 2) {
	            return new ColumnName(getEffectiveCatalog(tn), columnTokens[0], columnTokens[1]);
	        } else {
	            return new ColumnName(columnTokens[0], columnTokens[1], columnTokens[2]);
	        }
	    }

	    public IndexName normalizeIndexName(String str){
	            String [] indexTokens = str.split("\\.");
	            if((indexTokens.length) == 2 && (!sessionCatalog.isEmpty())){
	                return new IndexName(sessionCatalog, indexTokens[0], indexTokens[1]);
	            } else if(indexTokens.length == 3) {
	                return new IndexName(indexTokens[0], indexTokens[1], indexTokens[2]);
	            } else {
	                throwParsingException("Catalog can't be empty");
	            }
	            return null;
	    }

	    private ErrorsHelper foundErrors = new ErrorsHelper();

	    public ErrorsHelper getFoundErrors(){
	        return foundErrors;
	    }

	    public void throwParsingException(String message) {
	        throw new ParsingException(message);
	    }

	    public boolean checkWhereClauses(List<Relation> whereClauses){
	        if((whereClauses == null) || (whereClauses.isEmpty())){
	            return true;
	        }
	        for(Relation relation: whereClauses){
	            if(!(relation.getLeftTerm() instanceof ColumnSelector)){
	                return false;
	            }
	        }
	        return true;
	    }

	    @Override
	    public void displayRecognitionError(String[] tokenNames, RecognitionException e){        
	        String hdr = getErrorHeader(e);
	        String msg = getErrorMessage(e, tokenNames);
	        AntlrError antlrError = new AntlrError(hdr, msg);
	        foundErrors.addError(antlrError);
	    }



	// $ANTLR start "attachClusterStatement"
	// Meta.g:341:1: attachClusterStatement returns [AttachClusterStatement acs] : T_ATTACH T_CLUSTER ( T_IF T_NOT T_EXISTS )? clusterName= T_IDENT T_ON T_DATASTORE dataStoreName= T_IDENT ( T_WITH T_OPTIONS j= getJson )? ;
	public final AttachClusterStatement attachClusterStatement() throws RecognitionException {
		AttachClusterStatement acs = null;


		Token clusterName=null;
		Token dataStoreName=null;
		String j =null;


		        boolean ifNotExists = false;
		        j = "";
		    
		try {
			// Meta.g:352:6: ( T_ATTACH T_CLUSTER ( T_IF T_NOT T_EXISTS )? clusterName= T_IDENT T_ON T_DATASTORE dataStoreName= T_IDENT ( T_WITH T_OPTIONS j= getJson )? )
			// Meta.g:353:5: T_ATTACH T_CLUSTER ( T_IF T_NOT T_EXISTS )? clusterName= T_IDENT T_ON T_DATASTORE dataStoreName= T_IDENT ( T_WITH T_OPTIONS j= getJson )?
			{
			match(input,T_ATTACH,FOLLOW_T_ATTACH_in_attachClusterStatement2606); 
			match(input,T_CLUSTER,FOLLOW_T_CLUSTER_in_attachClusterStatement2608); 
			// Meta.g:354:5: ( T_IF T_NOT T_EXISTS )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==T_IF) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// Meta.g:354:6: T_IF T_NOT T_EXISTS
					{
					match(input,T_IF,FOLLOW_T_IF_in_attachClusterStatement2615); 
					match(input,T_NOT,FOLLOW_T_NOT_in_attachClusterStatement2617); 
					match(input,T_EXISTS,FOLLOW_T_EXISTS_in_attachClusterStatement2619); 
					ifNotExists = true;
					}
					break;

			}

			clusterName=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_attachClusterStatement2631); 
			match(input,T_ON,FOLLOW_T_ON_in_attachClusterStatement2637); 
			match(input,T_DATASTORE,FOLLOW_T_DATASTORE_in_attachClusterStatement2639); 
			dataStoreName=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_attachClusterStatement2643); 
			// Meta.g:357:5: ( T_WITH T_OPTIONS j= getJson )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==T_WITH) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// Meta.g:357:6: T_WITH T_OPTIONS j= getJson
					{
					match(input,T_WITH,FOLLOW_T_WITH_in_attachClusterStatement2650); 
					match(input,T_OPTIONS,FOLLOW_T_OPTIONS_in_attachClusterStatement2652); 
					pushFollow(FOLLOW_getJson_in_attachClusterStatement2656);
					j=getJson();
					state._fsp--;

					}
					break;

			}

			}


			        acs = new AttachClusterStatement(
			            new ClusterName((clusterName!=null?clusterName.getText():null)),
			            ifNotExists,
			            new DataStoreName((dataStoreName!=null?dataStoreName.getText():null)),
			            j);
			    
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return acs;
	}
	// $ANTLR end "attachClusterStatement"



	// $ANTLR start "detachClusterStatement"
	// Meta.g:360:1: detachClusterStatement returns [DetachClusterStatement dcs] : T_DETACH T_CLUSTER clusterName= T_IDENT ;
	public final DetachClusterStatement detachClusterStatement() throws RecognitionException {
		DetachClusterStatement dcs = null;


		Token clusterName=null;

		try {
			// Meta.g:363:6: ( T_DETACH T_CLUSTER clusterName= T_IDENT )
			// Meta.g:364:5: T_DETACH T_CLUSTER clusterName= T_IDENT
			{
			match(input,T_DETACH,FOLLOW_T_DETACH_in_detachClusterStatement2682); 
			match(input,T_CLUSTER,FOLLOW_T_CLUSTER_in_detachClusterStatement2684); 
			clusterName=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_detachClusterStatement2688); 
			}


			        dcs = new DetachClusterStatement((clusterName!=null?clusterName.getText():null));
			    
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return dcs;
	}
	// $ANTLR end "detachClusterStatement"



	// $ANTLR start "alterClusterStatement"
	// Meta.g:367:1: alterClusterStatement returns [AlterClusterStatement acs] : T_ALTER T_CLUSTER ( T_IF T_EXISTS )? clusterName= T_IDENT T_WITH T_OPTIONS j= getJson ;
	public final AlterClusterStatement alterClusterStatement() throws RecognitionException {
		AlterClusterStatement acs = null;


		Token clusterName=null;
		String j =null;


		        boolean ifExists = false;
		    
		try {
			// Meta.g:373:6: ( T_ALTER T_CLUSTER ( T_IF T_EXISTS )? clusterName= T_IDENT T_WITH T_OPTIONS j= getJson )
			// Meta.g:374:5: T_ALTER T_CLUSTER ( T_IF T_EXISTS )? clusterName= T_IDENT T_WITH T_OPTIONS j= getJson
			{
			match(input,T_ALTER,FOLLOW_T_ALTER_in_alterClusterStatement2720); 
			match(input,T_CLUSTER,FOLLOW_T_CLUSTER_in_alterClusterStatement2722); 
			// Meta.g:374:23: ( T_IF T_EXISTS )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==T_IF) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// Meta.g:374:24: T_IF T_EXISTS
					{
					match(input,T_IF,FOLLOW_T_IF_in_alterClusterStatement2725); 
					match(input,T_EXISTS,FOLLOW_T_EXISTS_in_alterClusterStatement2727); 
					ifExists = true;
					}
					break;

			}

			clusterName=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_alterClusterStatement2736); 
			match(input,T_WITH,FOLLOW_T_WITH_in_alterClusterStatement2738); 
			match(input,T_OPTIONS,FOLLOW_T_OPTIONS_in_alterClusterStatement2740); 
			pushFollow(FOLLOW_getJson_in_alterClusterStatement2744);
			j=getJson();
			state._fsp--;

			}


			        acs = new AlterClusterStatement((clusterName!=null?clusterName.getText():null), ifExists, j);
			    
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return acs;
	}
	// $ANTLR end "alterClusterStatement"



	// $ANTLR start "attachConnectorStatement"
	// Meta.g:381:1: attachConnectorStatement returns [AttachConnectorStatement acs] : T_ATTACH T_CONNECTOR connectorName= T_IDENT T_TO clusterName= T_IDENT ( T_WITH T_OPTIONS optionsJson= getJson )? ;
	public final AttachConnectorStatement attachConnectorStatement() throws RecognitionException {
		AttachConnectorStatement acs = null;


		Token connectorName=null;
		Token clusterName=null;
		String optionsJson =null;


		        optionsJson = "";
		    
		try {
			// Meta.g:388:6: ( T_ATTACH T_CONNECTOR connectorName= T_IDENT T_TO clusterName= T_IDENT ( T_WITH T_OPTIONS optionsJson= getJson )? )
			// Meta.g:389:5: T_ATTACH T_CONNECTOR connectorName= T_IDENT T_TO clusterName= T_IDENT ( T_WITH T_OPTIONS optionsJson= getJson )?
			{
			match(input,T_ATTACH,FOLLOW_T_ATTACH_in_attachConnectorStatement2780); 
			match(input,T_CONNECTOR,FOLLOW_T_CONNECTOR_in_attachConnectorStatement2782); 
			connectorName=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_attachConnectorStatement2786); 
			match(input,T_TO,FOLLOW_T_TO_in_attachConnectorStatement2788); 
			clusterName=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_attachConnectorStatement2792); 
			// Meta.g:389:73: ( T_WITH T_OPTIONS optionsJson= getJson )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==T_WITH) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// Meta.g:389:74: T_WITH T_OPTIONS optionsJson= getJson
					{
					match(input,T_WITH,FOLLOW_T_WITH_in_attachConnectorStatement2795); 
					match(input,T_OPTIONS,FOLLOW_T_OPTIONS_in_attachConnectorStatement2797); 
					pushFollow(FOLLOW_getJson_in_attachConnectorStatement2801);
					optionsJson=getJson();
					state._fsp--;

					}
					break;

			}

			}


			        acs = new AttachConnectorStatement(new ConnectorName((connectorName!=null?connectorName.getText():null)),
			        new ClusterName((clusterName!=null?clusterName.getText():null)), optionsJson);
			    
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return acs;
	}
	// $ANTLR end "attachConnectorStatement"



	// $ANTLR start "detachConnectorStatement"
	// Meta.g:392:1: detachConnectorStatement returns [DetachConnectorStatement dcs] : T_DETACH T_CONNECTOR connectorName= T_IDENT T_FROM clusterName= T_IDENT ;
	public final DetachConnectorStatement detachConnectorStatement() throws RecognitionException {
		DetachConnectorStatement dcs = null;


		Token connectorName=null;
		Token clusterName=null;

		try {
			// Meta.g:395:6: ( T_DETACH T_CONNECTOR connectorName= T_IDENT T_FROM clusterName= T_IDENT )
			// Meta.g:396:5: T_DETACH T_CONNECTOR connectorName= T_IDENT T_FROM clusterName= T_IDENT
			{
			match(input,T_DETACH,FOLLOW_T_DETACH_in_detachConnectorStatement2827); 
			match(input,T_CONNECTOR,FOLLOW_T_CONNECTOR_in_detachConnectorStatement2829); 
			connectorName=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_detachConnectorStatement2833); 
			match(input,T_FROM,FOLLOW_T_FROM_in_detachConnectorStatement2835); 
			clusterName=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_detachConnectorStatement2839); 
			}


			        dcs = new DetachConnectorStatement(new ConnectorName((connectorName!=null?connectorName.getText():null)), new ClusterName((clusterName!=null?clusterName.getText():null)));
			    
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return dcs;
	}
	// $ANTLR end "detachConnectorStatement"



	// $ANTLR start "createCatalogStatement"
	// Meta.g:403:1: createCatalogStatement returns [CreateCatalogStatement crctst] : T_CREATE T_CATALOG ( T_IF T_NOT T_EXISTS )? catalogName= T_IDENT ( T_WITH j= getJson )? ;
	public final CreateCatalogStatement createCatalogStatement() throws RecognitionException {
		CreateCatalogStatement crctst = null;


		Token catalogName=null;
		String j =null;


		        boolean ifNotExists = false;
		    
		try {
			// Meta.g:406:6: ( T_CREATE T_CATALOG ( T_IF T_NOT T_EXISTS )? catalogName= T_IDENT ( T_WITH j= getJson )? )
			// Meta.g:407:5: T_CREATE T_CATALOG ( T_IF T_NOT T_EXISTS )? catalogName= T_IDENT ( T_WITH j= getJson )?
			{
			match(input,T_CREATE,FOLLOW_T_CREATE_in_createCatalogStatement2867); 
			match(input,T_CATALOG,FOLLOW_T_CATALOG_in_createCatalogStatement2869); 
			// Meta.g:408:5: ( T_IF T_NOT T_EXISTS )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==T_IF) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Meta.g:408:6: T_IF T_NOT T_EXISTS
					{
					match(input,T_IF,FOLLOW_T_IF_in_createCatalogStatement2876); 
					match(input,T_NOT,FOLLOW_T_NOT_in_createCatalogStatement2878); 
					match(input,T_EXISTS,FOLLOW_T_EXISTS_in_createCatalogStatement2880); 
					ifNotExists = true;
					}
					break;

			}

			catalogName=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_createCatalogStatement2892); 
			// Meta.g:410:5: ( T_WITH j= getJson )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==T_WITH) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// Meta.g:410:6: T_WITH j= getJson
					{
					match(input,T_WITH,FOLLOW_T_WITH_in_createCatalogStatement2899); 
					pushFollow(FOLLOW_getJson_in_createCatalogStatement2903);
					j=getJson();
					state._fsp--;

					}
					break;

			}

			 crctst = new CreateCatalogStatement(new CatalogName((catalogName!=null?catalogName.getText():null)), ifNotExists, j); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return crctst;
	}
	// $ANTLR end "createCatalogStatement"



	// $ANTLR start "dropCatalogStatement"
	// Meta.g:414:1: dropCatalogStatement returns [DropCatalogStatement drcrst] : T_DROP T_CATALOG ( T_IF T_EXISTS )? catalogName= T_IDENT ;
	public final DropCatalogStatement dropCatalogStatement() throws RecognitionException {
		DropCatalogStatement drcrst = null;


		Token catalogName=null;


		        boolean ifExists = false;
		    
		try {
			// Meta.g:417:6: ( T_DROP T_CATALOG ( T_IF T_EXISTS )? catalogName= T_IDENT )
			// Meta.g:418:5: T_DROP T_CATALOG ( T_IF T_EXISTS )? catalogName= T_IDENT
			{
			match(input,T_DROP,FOLLOW_T_DROP_in_dropCatalogStatement2935); 
			match(input,T_CATALOG,FOLLOW_T_CATALOG_in_dropCatalogStatement2937); 
			// Meta.g:419:5: ( T_IF T_EXISTS )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==T_IF) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// Meta.g:419:6: T_IF T_EXISTS
					{
					match(input,T_IF,FOLLOW_T_IF_in_dropCatalogStatement2944); 
					match(input,T_EXISTS,FOLLOW_T_EXISTS_in_dropCatalogStatement2946); 
					ifExists = true;
					}
					break;

			}

			catalogName=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_dropCatalogStatement2958); 
			 drcrst = new DropCatalogStatement(new CatalogName((catalogName!=null?catalogName.getText():null)), ifExists);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return drcrst;
	}
	// $ANTLR end "dropCatalogStatement"



	// $ANTLR start "alterCatalogStatement"
	// Meta.g:424:1: alterCatalogStatement returns [AlterCatalogStatement alctst] : T_ALTER T_CATALOG catalogName= T_IDENT T_WITH j= getJson ;
	public final AlterCatalogStatement alterCatalogStatement() throws RecognitionException {
		AlterCatalogStatement alctst = null;


		Token catalogName=null;
		String j =null;

		try {
			// Meta.g:424:61: ( T_ALTER T_CATALOG catalogName= T_IDENT T_WITH j= getJson )
			// Meta.g:425:5: T_ALTER T_CATALOG catalogName= T_IDENT T_WITH j= getJson
			{
			match(input,T_ALTER,FOLLOW_T_ALTER_in_alterCatalogStatement2980); 
			match(input,T_CATALOG,FOLLOW_T_CATALOG_in_alterCatalogStatement2982); 
			catalogName=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_alterCatalogStatement2990); 
			match(input,T_WITH,FOLLOW_T_WITH_in_alterCatalogStatement2996); 
			pushFollow(FOLLOW_getJson_in_alterCatalogStatement3000);
			j=getJson();
			state._fsp--;

			 alctst = new AlterCatalogStatement(new CatalogName((catalogName!=null?catalogName.getText():null)), j); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return alctst;
	}
	// $ANTLR end "alterCatalogStatement"



	// $ANTLR start "describeStatement"
	// Meta.g:438:1: describeStatement returns [DescribeStatement descs] : T_DESCRIBE ( T_CATALOG genericID= getGenericID | T_CATALOGS | T_TABLE tablename= getTableName | T_TABLES | T_CLUSTER genericID= getGenericID | T_CLUSTERS | T_DATASTORE genericID= getGenericID | T_DATASTORES | T_CONNECTOR genericID= getGenericID | T_CONNECTORS ) ;
	public final DescribeStatement describeStatement() throws RecognitionException {
		DescribeStatement descs = null;


		String genericID =null;
		TableName tablename =null;

		try {
			// Meta.g:438:52: ( T_DESCRIBE ( T_CATALOG genericID= getGenericID | T_CATALOGS | T_TABLE tablename= getTableName | T_TABLES | T_CLUSTER genericID= getGenericID | T_CLUSTERS | T_DATASTORE genericID= getGenericID | T_DATASTORES | T_CONNECTOR genericID= getGenericID | T_CONNECTORS ) )
			// Meta.g:439:5: T_DESCRIBE ( T_CATALOG genericID= getGenericID | T_CATALOGS | T_TABLE tablename= getTableName | T_TABLES | T_CLUSTER genericID= getGenericID | T_CLUSTERS | T_DATASTORE genericID= getGenericID | T_DATASTORES | T_CONNECTOR genericID= getGenericID | T_CONNECTORS )
			{
			match(input,T_DESCRIBE,FOLLOW_T_DESCRIBE_in_describeStatement3029); 
			// Meta.g:439:16: ( T_CATALOG genericID= getGenericID | T_CATALOGS | T_TABLE tablename= getTableName | T_TABLES | T_CLUSTER genericID= getGenericID | T_CLUSTERS | T_DATASTORE genericID= getGenericID | T_DATASTORES | T_CONNECTOR genericID= getGenericID | T_CONNECTORS )
			int alt8=10;
			switch ( input.LA(1) ) {
			case T_CATALOG:
				{
				alt8=1;
				}
				break;
			case T_CATALOGS:
				{
				alt8=2;
				}
				break;
			case T_TABLE:
				{
				alt8=3;
				}
				break;
			case T_TABLES:
				{
				alt8=4;
				}
				break;
			case T_CLUSTER:
				{
				alt8=5;
				}
				break;
			case T_CLUSTERS:
				{
				alt8=6;
				}
				break;
			case T_DATASTORE:
				{
				alt8=7;
				}
				break;
			case T_DATASTORES:
				{
				alt8=8;
				}
				break;
			case T_CONNECTOR:
				{
				alt8=9;
				}
				break;
			case T_CONNECTORS:
				{
				alt8=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// Meta.g:440:9: T_CATALOG genericID= getGenericID
					{
					match(input,T_CATALOG,FOLLOW_T_CATALOG_in_describeStatement3041); 
					pushFollow(FOLLOW_getGenericID_in_describeStatement3045);
					genericID=getGenericID();
					state._fsp--;

					descs = new DescribeStatement(DescribeType.CATALOG); descs.setCatalog(new CatalogName(genericID));
					}
					break;
				case 2 :
					// Meta.g:441:8: T_CATALOGS
					{
					match(input,T_CATALOGS,FOLLOW_T_CATALOGS_in_describeStatement3056); 
					descs = new DescribeStatement(DescribeType.CATALOGS);
					}
					break;
				case 3 :
					// Meta.g:442:11: T_TABLE tablename= getTableName
					{
					match(input,T_TABLE,FOLLOW_T_TABLE_in_describeStatement3070); 
					pushFollow(FOLLOW_getTableName_in_describeStatement3074);
					tablename=getTableName();
					state._fsp--;

					 descs = new DescribeStatement(DescribeType.TABLE); descs.setTableName(tablename);
					}
					break;
				case 4 :
					// Meta.g:443:11: T_TABLES
					{
					match(input,T_TABLES,FOLLOW_T_TABLES_in_describeStatement3088); 
					descs = new DescribeStatement(DescribeType.TABLES);
					}
					break;
				case 5 :
					// Meta.g:444:11: T_CLUSTER genericID= getGenericID
					{
					match(input,T_CLUSTER,FOLLOW_T_CLUSTER_in_describeStatement3102); 
					pushFollow(FOLLOW_getGenericID_in_describeStatement3106);
					genericID=getGenericID();
					state._fsp--;

					descs = new DescribeStatement(DescribeType.CLUSTER); descs.setClusterName(new ClusterName(genericID));
					}
					break;
				case 6 :
					// Meta.g:445:11: T_CLUSTERS
					{
					match(input,T_CLUSTERS,FOLLOW_T_CLUSTERS_in_describeStatement3120); 
					descs = new DescribeStatement(DescribeType.CLUSTERS); 
					}
					break;
				case 7 :
					// Meta.g:446:11: T_DATASTORE genericID= getGenericID
					{
					match(input,T_DATASTORE,FOLLOW_T_DATASTORE_in_describeStatement3134); 
					pushFollow(FOLLOW_getGenericID_in_describeStatement3138);
					genericID=getGenericID();
					state._fsp--;

					descs = new DescribeStatement(DescribeType.DATASTORE); descs.setDataStoreName(new DataStoreName(genericID));
					}
					break;
				case 8 :
					// Meta.g:447:11: T_DATASTORES
					{
					match(input,T_DATASTORES,FOLLOW_T_DATASTORES_in_describeStatement3152); 
					descs = new DescribeStatement(DescribeType.DATASTORES);
					}
					break;
				case 9 :
					// Meta.g:448:11: T_CONNECTOR genericID= getGenericID
					{
					match(input,T_CONNECTOR,FOLLOW_T_CONNECTOR_in_describeStatement3166); 
					pushFollow(FOLLOW_getGenericID_in_describeStatement3170);
					genericID=getGenericID();
					state._fsp--;

					descs = new DescribeStatement(DescribeType.CONNECTOR); descs.setConnectorName(new ConnectorName(genericID));
					}
					break;
				case 10 :
					// Meta.g:449:11: T_CONNECTORS
					{
					match(input,T_CONNECTORS,FOLLOW_T_CONNECTORS_in_describeStatement3184); 
					descs = new DescribeStatement(DescribeType.CONNECTORS);
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return descs;
	}
	// $ANTLR end "describeStatement"



	// $ANTLR start "deleteStatement"
	// Meta.g:454:1: deleteStatement returns [DeleteStatement ds] : T_DELETE T_FROM tablename= getTableName T_WHERE whereClauses= getWhereClauses[tablename] ;
	public final DeleteStatement deleteStatement() throws RecognitionException {
		DeleteStatement ds = null;


		TableName tablename =null;
		ArrayList<Relation> whereClauses =null;

		try {
			// Meta.g:457:3: ( T_DELETE T_FROM tablename= getTableName T_WHERE whereClauses= getWhereClauses[tablename] )
			// Meta.g:458:2: T_DELETE T_FROM tablename= getTableName T_WHERE whereClauses= getWhereClauses[tablename]
			{
			match(input,T_DELETE,FOLLOW_T_DELETE_in_deleteStatement3211); 
			match(input,T_FROM,FOLLOW_T_FROM_in_deleteStatement3213); 
			pushFollow(FOLLOW_getTableName_in_deleteStatement3217);
			tablename=getTableName();
			state._fsp--;

			match(input,T_WHERE,FOLLOW_T_WHERE_in_deleteStatement3220); 
			pushFollow(FOLLOW_getWhereClauses_in_deleteStatement3224);
			whereClauses=getWhereClauses(tablename);
			state._fsp--;

			 if(!checkWhereClauses(whereClauses)) throwParsingException("Left terms of where clauses must be a column name"); 
			}


					ds = new DeleteStatement(tablename, whereClauses);
				
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ds;
	}
	// $ANTLR end "deleteStatement"



	// $ANTLR start "addStatement"
	// Meta.g:463:1: addStatement returns [AddStatement as] : T_ADD name= QUOTED_LITERAL ;
	public final AddStatement addStatement() throws RecognitionException {
		AddStatement as = null;


		Token name=null;

		try {
			// Meta.g:463:39: ( T_ADD name= QUOTED_LITERAL )
			// Meta.g:464:2: T_ADD name= QUOTED_LITERAL
			{
			match(input,T_ADD,FOLLOW_T_ADD_in_addStatement3241); 
			name=(Token)match(input,QUOTED_LITERAL,FOLLOW_QUOTED_LITERAL_in_addStatement3245); 
			as = new AddStatement((name!=null?name.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return as;
	}
	// $ANTLR end "addStatement"



	// $ANTLR start "dropManifestStatement"
	// Meta.g:468:1: dropManifestStatement returns [MetaStatement dms] : T_DROP ( T_DATASTORE | T_CONNECTOR ) name= T_IDENT ;
	public final MetaStatement dropManifestStatement() throws RecognitionException {
		MetaStatement dms = null;


		Token name=null;


		        boolean dataStore = true;
		    
		try {
			// Meta.g:471:6: ( T_DROP ( T_DATASTORE | T_CONNECTOR ) name= T_IDENT )
			// Meta.g:472:5: T_DROP ( T_DATASTORE | T_CONNECTOR ) name= T_IDENT
			{
			match(input,T_DROP,FOLLOW_T_DROP_in_dropManifestStatement3272); 
			// Meta.g:472:12: ( T_DATASTORE | T_CONNECTOR )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==T_DATASTORE) ) {
				alt9=1;
			}
			else if ( (LA9_0==T_CONNECTOR) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// Meta.g:472:13: T_DATASTORE
					{
					match(input,T_DATASTORE,FOLLOW_T_DATASTORE_in_dropManifestStatement3275); 
					}
					break;
				case 2 :
					// Meta.g:472:27: T_CONNECTOR
					{
					match(input,T_CONNECTOR,FOLLOW_T_CONNECTOR_in_dropManifestStatement3279); 
					 dataStore = false; 
					}
					break;

			}

			name=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_dropManifestStatement3287); 
			 if(dataStore)
			        dms = new DropDataStoreStatement((name!=null?name.getText():null));
			      else
			        dms = new DropConnectorStatement((name!=null?name.getText():null));
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return dms;
	}
	// $ANTLR end "dropManifestStatement"



	// $ANTLR start "listStatement"
	// Meta.g:481:1: listStatement returns [ListStatement ls] : T_LIST (type= getListTypes ) ;
	public final ListStatement listStatement() throws RecognitionException {
		ListStatement ls = null;


		ParserRuleReturnScope type =null;

		try {
			// Meta.g:481:41: ( T_LIST (type= getListTypes ) )
			// Meta.g:482:2: T_LIST (type= getListTypes )
			{
			match(input,T_LIST,FOLLOW_T_LIST_in_listStatement3307); 
			// Meta.g:482:9: (type= getListTypes )
			// Meta.g:482:10: type= getListTypes
			{
			pushFollow(FOLLOW_getListTypes_in_listStatement3312);
			type=getListTypes();
			state._fsp--;

			}


					if((type!=null?input.toString(type.start,type.stop):null) != null){
						ls = new ListStatement((type!=null?input.toString(type.start,type.stop):null));
					}else{
						throw new RecognitionException();
					}
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ls;
	}
	// $ANTLR end "listStatement"



	// $ANTLR start "removeUDFStatement"
	// Meta.g:493:1: removeUDFStatement returns [RemoveUDFStatement rus] : T_REMOVE T_UDF jar= QUOTED_LITERAL ;
	public final RemoveUDFStatement removeUDFStatement() throws RecognitionException {
		RemoveUDFStatement rus = null;


		Token jar=null;

		try {
			// Meta.g:493:52: ( T_REMOVE T_UDF jar= QUOTED_LITERAL )
			// Meta.g:494:2: T_REMOVE T_UDF jar= QUOTED_LITERAL
			{
			match(input,T_REMOVE,FOLLOW_T_REMOVE_in_removeUDFStatement3330); 
			match(input,T_UDF,FOLLOW_T_UDF_in_removeUDFStatement3332); 
			jar=(Token)match(input,QUOTED_LITERAL,FOLLOW_QUOTED_LITERAL_in_removeUDFStatement3336); 
			rus = new RemoveUDFStatement((jar!=null?jar.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return rus;
	}
	// $ANTLR end "removeUDFStatement"



	// $ANTLR start "dropIndexStatement"
	// Meta.g:498:1: dropIndexStatement returns [DropIndexStatement dis] : T_DROP T_INDEX ( T_IF T_EXISTS )? name= getIndexName ;
	public final DropIndexStatement dropIndexStatement() throws RecognitionException {
		DropIndexStatement dis = null;


		IndexName name =null;


				dis = new DropIndexStatement();
			
		try {
			// Meta.g:501:3: ( T_DROP T_INDEX ( T_IF T_EXISTS )? name= getIndexName )
			// Meta.g:502:2: T_DROP T_INDEX ( T_IF T_EXISTS )? name= getIndexName
			{
			match(input,T_DROP,FOLLOW_T_DROP_in_dropIndexStatement3357); 
			match(input,T_INDEX,FOLLOW_T_INDEX_in_dropIndexStatement3359); 
			// Meta.g:503:2: ( T_IF T_EXISTS )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==T_IF) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// Meta.g:503:3: T_IF T_EXISTS
					{
					match(input,T_IF,FOLLOW_T_IF_in_dropIndexStatement3363); 
					match(input,T_EXISTS,FOLLOW_T_EXISTS_in_dropIndexStatement3365); 
					 dis.setDropIfExists(); 
					}
					break;

			}

			pushFollow(FOLLOW_getIndexName_in_dropIndexStatement3375);
			name=getIndexName();
			state._fsp--;

			 dis.setName(name); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return dis;
	}
	// $ANTLR end "dropIndexStatement"



	// $ANTLR start "createIndexStatement"
	// Meta.g:510:1: createIndexStatement returns [CreateIndexStatement cis] : T_CREATE (indexType= getIndexType )? T_INDEX ( T_IF T_NOT T_EXISTS )? (name= getColumnName[null] )? T_ON tablename= getTableName T_START_PARENTHESIS firstField= getColumnName[tablename] ( T_COMMA field= getColumnName[tablename] )* T_END_PARENTHESIS ( T_USING usingClass= QUOTED_LITERAL )? ( T_WITH j= getJson )? ;
	public final CreateIndexStatement createIndexStatement() throws RecognitionException {
		CreateIndexStatement cis = null;


		Token usingClass=null;
		String indexType =null;
		ColumnName name =null;
		TableName tablename =null;
		ColumnName firstField =null;
		ColumnName field =null;
		String j =null;


				cis = new CreateIndexStatement();
			
		try {
			// Meta.g:516:3: ( T_CREATE (indexType= getIndexType )? T_INDEX ( T_IF T_NOT T_EXISTS )? (name= getColumnName[null] )? T_ON tablename= getTableName T_START_PARENTHESIS firstField= getColumnName[tablename] ( T_COMMA field= getColumnName[tablename] )* T_END_PARENTHESIS ( T_USING usingClass= QUOTED_LITERAL )? ( T_WITH j= getJson )? )
			// Meta.g:517:2: T_CREATE (indexType= getIndexType )? T_INDEX ( T_IF T_NOT T_EXISTS )? (name= getColumnName[null] )? T_ON tablename= getTableName T_START_PARENTHESIS firstField= getColumnName[tablename] ( T_COMMA field= getColumnName[tablename] )* T_END_PARENTHESIS ( T_USING usingClass= QUOTED_LITERAL )? ( T_WITH j= getJson )?
			{
			match(input,T_CREATE,FOLLOW_T_CREATE_in_createIndexStatement3403); 
			cis.setIndexType("default");
			// Meta.g:517:43: (indexType= getIndexType )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==T_CUSTOM||LA11_0==T_DEFAULT||LA11_0==T_FULL_TEXT) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// Meta.g:517:44: indexType= getIndexType
					{
					pushFollow(FOLLOW_getIndexType_in_createIndexStatement3410);
					indexType=getIndexType();
					state._fsp--;

					cis.setIndexType(indexType);
					}
					break;

			}

			match(input,T_INDEX,FOLLOW_T_INDEX_in_createIndexStatement3416); 
			// Meta.g:518:2: ( T_IF T_NOT T_EXISTS )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==T_IF) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// Meta.g:518:3: T_IF T_NOT T_EXISTS
					{
					match(input,T_IF,FOLLOW_T_IF_in_createIndexStatement3420); 
					match(input,T_NOT,FOLLOW_T_NOT_in_createIndexStatement3422); 
					match(input,T_EXISTS,FOLLOW_T_EXISTS_in_createIndexStatement3424); 
					cis.setCreateIfNotExists();
					}
					break;

			}

			// Meta.g:519:2: (name= getColumnName[null] )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==T_BOOLEAN||LA13_0==T_CATALOG||LA13_0==T_COUNT||LA13_0==T_CTLG_TBL_COL||(LA13_0 >= T_DAY && LA13_0 <= T_DAYS)||(LA13_0 >= T_HOUR && LA13_0 <= T_IDENT)||LA13_0==T_INT||LA13_0==T_KEY||LA13_0==T_KS_AND_TN||LA13_0==T_LIMIT||(LA13_0 >= T_LUCENE && LA13_0 <= T_MAP)||(LA13_0 >= T_MINS && LA13_0 <= T_MINUTES)||LA13_0==T_OPTIONS||LA13_0==T_PLAN||LA13_0==T_PROCESS||(LA13_0 >= T_SEC && LA13_0 <= T_SECS)||LA13_0==T_STORAGE||LA13_0==T_TEXT||LA13_0==T_TYPE) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// Meta.g:519:3: name= getColumnName[null]
					{
					pushFollow(FOLLOW_getColumnName_in_createIndexStatement3434);
					name=getColumnName(null);
					state._fsp--;

					 cis.setName(name);
					}
					break;

			}

			match(input,T_ON,FOLLOW_T_ON_in_createIndexStatement3443); 
			pushFollow(FOLLOW_getTableName_in_createIndexStatement3447);
			tablename=getTableName();
			state._fsp--;

			cis.setTableName(tablename);
			match(input,T_START_PARENTHESIS,FOLLOW_T_START_PARENTHESIS_in_createIndexStatement3452); 
			pushFollow(FOLLOW_getColumnName_in_createIndexStatement3464);
			firstField=getColumnName(tablename);
			state._fsp--;

			cis.addColumn(firstField);
			// Meta.g:523:2: ( T_COMMA field= getColumnName[tablename] )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==T_COMMA) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// Meta.g:523:3: T_COMMA field= getColumnName[tablename]
					{
					match(input,T_COMMA,FOLLOW_T_COMMA_in_createIndexStatement3471); 
					pushFollow(FOLLOW_getColumnName_in_createIndexStatement3477);
					field=getColumnName(tablename);
					state._fsp--;

					cis.addColumn(field);
					}
					break;

				default :
					break loop14;
				}
			}

			match(input,T_END_PARENTHESIS,FOLLOW_T_END_PARENTHESIS_in_createIndexStatement3487); 
			// Meta.g:527:2: ( T_USING usingClass= QUOTED_LITERAL )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==T_USING) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// Meta.g:527:3: T_USING usingClass= QUOTED_LITERAL
					{
					match(input,T_USING,FOLLOW_T_USING_in_createIndexStatement3491); 
					usingClass=(Token)match(input,QUOTED_LITERAL,FOLLOW_QUOTED_LITERAL_in_createIndexStatement3495); 
					cis.setUsingClass((usingClass!=null?usingClass.getText():null));
					}
					break;

			}

			// Meta.g:528:2: ( T_WITH j= getJson )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==T_WITH) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// Meta.g:528:3: T_WITH j= getJson
					{
					match(input,T_WITH,FOLLOW_T_WITH_in_createIndexStatement3503); 
					pushFollow(FOLLOW_getJson_in_createIndexStatement3507);
					j=getJson();
					state._fsp--;

					cis.setOptionsJson(j);
					}
					break;

			}

			}


				    cis.normalizeIndexName();
				
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return cis;
	}
	// $ANTLR end "createIndexStatement"



	// $ANTLR start "getIndexType"
	// Meta.g:532:1: getIndexType returns [String indexType] : (idxType= T_DEFAULT |idxType= T_FULL_TEXT |idxType= T_CUSTOM ) ;
	public final String getIndexType() throws RecognitionException {
		String indexType = null;


		Token idxType=null;

		try {
			// Meta.g:532:40: ( (idxType= T_DEFAULT |idxType= T_FULL_TEXT |idxType= T_CUSTOM ) )
			// Meta.g:533:5: (idxType= T_DEFAULT |idxType= T_FULL_TEXT |idxType= T_CUSTOM )
			{
			// Meta.g:533:5: (idxType= T_DEFAULT |idxType= T_FULL_TEXT |idxType= T_CUSTOM )
			int alt17=3;
			switch ( input.LA(1) ) {
			case T_DEFAULT:
				{
				alt17=1;
				}
				break;
			case T_FULL_TEXT:
				{
				alt17=2;
				}
				break;
			case T_CUSTOM:
				{
				alt17=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// Meta.g:533:7: idxType= T_DEFAULT
					{
					idxType=(Token)match(input,T_DEFAULT,FOLLOW_T_DEFAULT_in_getIndexType3533); 
					}
					break;
				case 2 :
					// Meta.g:534:7: idxType= T_FULL_TEXT
					{
					idxType=(Token)match(input,T_FULL_TEXT,FOLLOW_T_FULL_TEXT_in_getIndexType3543); 
					}
					break;
				case 3 :
					// Meta.g:535:7: idxType= T_CUSTOM
					{
					idxType=(Token)match(input,T_CUSTOM,FOLLOW_T_CUSTOM_in_getIndexType3553); 
					}
					break;

			}

			indexType =(idxType!=null?idxType.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return indexType;
	}
	// $ANTLR end "getIndexType"



	// $ANTLR start "getField"
	// Meta.g:539:1: getField returns [String newField] : (unitField= getUnits |fieldToken= ( T_IDENT | T_LUCENE | T_KEY ) ) ;
	public final String getField() throws RecognitionException {
		String newField = null;


		Token fieldToken=null;
		String unitField =null;

		try {
			// Meta.g:539:35: ( (unitField= getUnits |fieldToken= ( T_IDENT | T_LUCENE | T_KEY ) ) )
			// Meta.g:540:5: (unitField= getUnits |fieldToken= ( T_IDENT | T_LUCENE | T_KEY ) )
			{
			// Meta.g:540:5: (unitField= getUnits |fieldToken= ( T_IDENT | T_LUCENE | T_KEY ) )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( ((LA18_0 >= T_DAY && LA18_0 <= T_DAYS)||(LA18_0 >= T_HOUR && LA18_0 <= T_HOURS)||(LA18_0 >= T_MIN && LA18_0 <= T_MINS)||LA18_0==T_MINUTES||LA18_0==T_SEC||(LA18_0 >= T_SECONDS && LA18_0 <= T_SECS)) ) {
				alt18=1;
			}
			else if ( (LA18_0==T_IDENT||LA18_0==T_KEY||LA18_0==T_LUCENE) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// Meta.g:540:6: unitField= getUnits
					{
					pushFollow(FOLLOW_getUnits_in_getField3579);
					unitField=getUnits();
					state._fsp--;

					newField = unitField;
					}
					break;
				case 2 :
					// Meta.g:541:6: fieldToken= ( T_IDENT | T_LUCENE | T_KEY )
					{
					fieldToken=input.LT(1);
					if ( input.LA(1)==T_IDENT||input.LA(1)==T_KEY||input.LA(1)==T_LUCENE ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					newField = (fieldToken!=null?fieldToken.getText():null);
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return newField;
	}
	// $ANTLR end "getField"



	// $ANTLR start "getUnits"
	// Meta.g:544:1: getUnits returns [String newUnit] : unitToken= ( T_SEC | T_SECS | T_SECONDS | T_MIN | T_MINS | T_MINUTES | T_HOUR | T_HOURS | T_DAY | T_DAYS ) ;
	public final String getUnits() throws RecognitionException {
		String newUnit = null;


		Token unitToken=null;

		try {
			// Meta.g:544:34: (unitToken= ( T_SEC | T_SECS | T_SECONDS | T_MIN | T_MINS | T_MINUTES | T_HOUR | T_HOURS | T_DAY | T_DAYS ) )
			// Meta.g:545:5: unitToken= ( T_SEC | T_SECS | T_SECONDS | T_MIN | T_MINS | T_MINUTES | T_HOUR | T_HOURS | T_DAY | T_DAYS )
			{
			unitToken=input.LT(1);
			if ( (input.LA(1) >= T_DAY && input.LA(1) <= T_DAYS)||(input.LA(1) >= T_HOUR && input.LA(1) <= T_HOURS)||(input.LA(1) >= T_MIN && input.LA(1) <= T_MINS)||input.LA(1)==T_MINUTES||input.LA(1)==T_SEC||(input.LA(1) >= T_SECONDS && input.LA(1) <= T_SECS) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			newUnit = (unitToken!=null?unitToken.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return newUnit;
	}
	// $ANTLR end "getUnits"



	// $ANTLR start "updateTableStatement"
	// Meta.g:558:1: updateTableStatement returns [UpdateTableStatement pdtbst] : T_UPDATE tablename= getTableName ( T_USING opt1= getOption[tablename] ( T_AND optN= getOption[tablename] )* )? T_SET assig1= getAssignment[tablename] ( T_COMMA assigN= getAssignment[tablename] )* ( T_WHERE whereClauses= getWhereClauses[tablename] )? ( T_IF id1= getSelector[tablename] T_EQUAL term1= getSelector[tablename] ( T_AND idN= getSelector[tablename] T_EQUAL termN= getSelector[tablename] )* )? ;
	public final UpdateTableStatement updateTableStatement() throws RecognitionException {
		UpdateTableStatement pdtbst = null;


		TableName tablename =null;
		Option opt1 =null;
		Option optN =null;
		Relation assig1 =null;
		Relation assigN =null;
		ArrayList<Relation> whereClauses =null;
		Selector id1 =null;
		Selector term1 =null;
		Selector idN =null;
		Selector termN =null;


		        boolean optsInc = false;
		        boolean condsInc = false;
		        ArrayList<Option> options = new ArrayList<>();
		        ArrayList<Relation> assignations = new ArrayList<>();
		        Map<Selector, Selector> conditions = new LinkedHashMap<>();
		    
		try {
			// Meta.g:565:6: ( T_UPDATE tablename= getTableName ( T_USING opt1= getOption[tablename] ( T_AND optN= getOption[tablename] )* )? T_SET assig1= getAssignment[tablename] ( T_COMMA assigN= getAssignment[tablename] )* ( T_WHERE whereClauses= getWhereClauses[tablename] )? ( T_IF id1= getSelector[tablename] T_EQUAL term1= getSelector[tablename] ( T_AND idN= getSelector[tablename] T_EQUAL termN= getSelector[tablename] )* )? )
			// Meta.g:566:5: T_UPDATE tablename= getTableName ( T_USING opt1= getOption[tablename] ( T_AND optN= getOption[tablename] )* )? T_SET assig1= getAssignment[tablename] ( T_COMMA assigN= getAssignment[tablename] )* ( T_WHERE whereClauses= getWhereClauses[tablename] )? ( T_IF id1= getSelector[tablename] T_EQUAL term1= getSelector[tablename] ( T_AND idN= getSelector[tablename] T_EQUAL termN= getSelector[tablename] )* )?
			{
			match(input,T_UPDATE,FOLLOW_T_UPDATE_in_updateTableStatement3725); 
			pushFollow(FOLLOW_getTableName_in_updateTableStatement3729);
			tablename=getTableName();
			state._fsp--;

			// Meta.g:567:5: ( T_USING opt1= getOption[tablename] ( T_AND optN= getOption[tablename] )* )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==T_USING) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// Meta.g:567:6: T_USING opt1= getOption[tablename] ( T_AND optN= getOption[tablename] )*
					{
					match(input,T_USING,FOLLOW_T_USING_in_updateTableStatement3736); 
					pushFollow(FOLLOW_getOption_in_updateTableStatement3740);
					opt1=getOption(tablename);
					state._fsp--;

					optsInc = true; options.add(opt1);
					// Meta.g:567:77: ( T_AND optN= getOption[tablename] )*
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==T_AND) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// Meta.g:567:78: T_AND optN= getOption[tablename]
							{
							match(input,T_AND,FOLLOW_T_AND_in_updateTableStatement3746); 
							pushFollow(FOLLOW_getOption_in_updateTableStatement3750);
							optN=getOption(tablename);
							state._fsp--;

							options.add(optN);
							}
							break;

						default :
							break loop19;
						}
					}

					}
					break;

			}

			match(input,T_SET,FOLLOW_T_SET_in_updateTableStatement3763); 
			pushFollow(FOLLOW_getAssignment_in_updateTableStatement3767);
			assig1=getAssignment(tablename);
			state._fsp--;

			assignations.add(assig1);
			// Meta.g:568:71: ( T_COMMA assigN= getAssignment[tablename] )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==T_COMMA) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// Meta.g:568:72: T_COMMA assigN= getAssignment[tablename]
					{
					match(input,T_COMMA,FOLLOW_T_COMMA_in_updateTableStatement3773); 
					pushFollow(FOLLOW_getAssignment_in_updateTableStatement3777);
					assigN=getAssignment(tablename);
					state._fsp--;

					assignations.add(assigN);
					}
					break;

				default :
					break loop21;
				}
			}

			// Meta.g:569:5: ( T_WHERE whereClauses= getWhereClauses[tablename] )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==T_WHERE) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// Meta.g:569:6: T_WHERE whereClauses= getWhereClauses[tablename]
					{
					match(input,T_WHERE,FOLLOW_T_WHERE_in_updateTableStatement3789); 
					pushFollow(FOLLOW_getWhereClauses_in_updateTableStatement3793);
					whereClauses=getWhereClauses(tablename);
					state._fsp--;

					}
					break;

			}

			// Meta.g:570:5: ( T_IF id1= getSelector[tablename] T_EQUAL term1= getSelector[tablename] ( T_AND idN= getSelector[tablename] T_EQUAL termN= getSelector[tablename] )* )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==T_IF) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// Meta.g:570:6: T_IF id1= getSelector[tablename] T_EQUAL term1= getSelector[tablename] ( T_AND idN= getSelector[tablename] T_EQUAL termN= getSelector[tablename] )*
					{
					match(input,T_IF,FOLLOW_T_IF_in_updateTableStatement3803); 
					pushFollow(FOLLOW_getSelector_in_updateTableStatement3807);
					id1=getSelector(tablename);
					state._fsp--;

					match(input,T_EQUAL,FOLLOW_T_EQUAL_in_updateTableStatement3810); 
					pushFollow(FOLLOW_getSelector_in_updateTableStatement3814);
					term1=getSelector(tablename);
					state._fsp--;

					condsInc = true; conditions.put(id1, term1);
					// Meta.g:571:21: ( T_AND idN= getSelector[tablename] T_EQUAL termN= getSelector[tablename] )*
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( (LA23_0==T_AND) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// Meta.g:571:22: T_AND idN= getSelector[tablename] T_EQUAL termN= getSelector[tablename]
							{
							match(input,T_AND,FOLLOW_T_AND_in_updateTableStatement3840); 
							pushFollow(FOLLOW_getSelector_in_updateTableStatement3844);
							idN=getSelector(tablename);
							state._fsp--;

							match(input,T_EQUAL,FOLLOW_T_EQUAL_in_updateTableStatement3847); 
							pushFollow(FOLLOW_getSelector_in_updateTableStatement3851);
							termN=getSelector(tablename);
							state._fsp--;

							conditions.put(idN, termN);
							}
							break;

						default :
							break loop23;
						}
					}

					}
					break;

			}


			        if(!checkWhereClauses(whereClauses)) throwParsingException("Left terms of where clauses must be a column name");
			        if(optsInc)
			            if(condsInc)
			                pdtbst = new UpdateTableStatement(tablename, options, assignations, whereClauses, conditions);
			            else
			                pdtbst = new UpdateTableStatement(tablename, options, assignations, whereClauses);
			        else
			            if(condsInc)
			                pdtbst = new UpdateTableStatement(tablename, assignations, whereClauses, conditions);
			            else
			                pdtbst = new UpdateTableStatement(tablename, assignations, whereClauses);
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return pdtbst;
	}
	// $ANTLR end "updateTableStatement"



	// $ANTLR start "stopProcessStatement"
	// Meta.g:587:1: stopProcessStatement returns [StopProcessStatement stprst] : T_STOP T_PROCESS tablename= T_IDENT ;
	public final StopProcessStatement stopProcessStatement() throws RecognitionException {
		StopProcessStatement stprst = null;


		Token tablename=null;

		try {
			// Meta.g:587:59: ( T_STOP T_PROCESS tablename= T_IDENT )
			// Meta.g:588:5: T_STOP T_PROCESS tablename= T_IDENT
			{
			match(input,T_STOP,FOLLOW_T_STOP_in_stopProcessStatement3880); 
			match(input,T_PROCESS,FOLLOW_T_PROCESS_in_stopProcessStatement3882); 
			tablename=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_stopProcessStatement3886); 
			 stprst = new StopProcessStatement((tablename!=null?tablename.getText():null)); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stprst;
	}
	// $ANTLR end "stopProcessStatement"



	// $ANTLR start "dropTriggerStatement"
	// Meta.g:591:1: dropTriggerStatement returns [DropTriggerStatement drtrst] : T_DROP T_TRIGGER tablename= T_IDENT T_ON ident2= T_IDENT ;
	public final DropTriggerStatement dropTriggerStatement() throws RecognitionException {
		DropTriggerStatement drtrst = null;


		Token tablename=null;
		Token ident2=null;

		try {
			// Meta.g:591:59: ( T_DROP T_TRIGGER tablename= T_IDENT T_ON ident2= T_IDENT )
			// Meta.g:592:5: T_DROP T_TRIGGER tablename= T_IDENT T_ON ident2= T_IDENT
			{
			match(input,T_DROP,FOLLOW_T_DROP_in_dropTriggerStatement3904); 
			match(input,T_TRIGGER,FOLLOW_T_TRIGGER_in_dropTriggerStatement3910); 
			tablename=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_dropTriggerStatement3914); 
			match(input,T_ON,FOLLOW_T_ON_in_dropTriggerStatement3920); 
			ident2=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_dropTriggerStatement3928); 
			drtrst = new DropTriggerStatement((tablename!=null?tablename.getText():null),(ident2!=null?ident2.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return drtrst;
	}
	// $ANTLR end "dropTriggerStatement"



	// $ANTLR start "createTriggerStatement"
	// Meta.g:599:1: createTriggerStatement returns [CreateTriggerStatement crtrst] : T_CREATE T_TRIGGER trigger_name= T_IDENT T_ON table_name= T_IDENT T_USING class_name= T_IDENT ;
	public final CreateTriggerStatement createTriggerStatement() throws RecognitionException {
		CreateTriggerStatement crtrst = null;


		Token trigger_name=null;
		Token table_name=null;
		Token class_name=null;

		try {
			// Meta.g:599:63: ( T_CREATE T_TRIGGER trigger_name= T_IDENT T_ON table_name= T_IDENT T_USING class_name= T_IDENT )
			// Meta.g:600:5: T_CREATE T_TRIGGER trigger_name= T_IDENT T_ON table_name= T_IDENT T_USING class_name= T_IDENT
			{
			match(input,T_CREATE,FOLLOW_T_CREATE_in_createTriggerStatement3954); 
			match(input,T_TRIGGER,FOLLOW_T_TRIGGER_in_createTriggerStatement3960); 
			trigger_name=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_createTriggerStatement3964); 
			match(input,T_ON,FOLLOW_T_ON_in_createTriggerStatement3970); 
			table_name=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_createTriggerStatement3978); 
			match(input,T_USING,FOLLOW_T_USING_in_createTriggerStatement3984); 
			class_name=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_createTriggerStatement3988); 
			crtrst = new CreateTriggerStatement((trigger_name!=null?trigger_name.getText():null),(table_name!=null?table_name.getText():null),(class_name!=null?class_name.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return crtrst;
	}
	// $ANTLR end "createTriggerStatement"



	// $ANTLR start "createTableStatement"
	// Meta.g:608:1: createTableStatement returns [CreateTableStatement crtast] : T_CREATE tableType= getTableType T_TABLE ( T_IF T_NOT T_EXISTS )? tablename= getTableName T_ON T_CLUSTER clusterID= T_IDENT T_START_PARENTHESIS id1= getColumnName[tablename] type1= getDataType ( T_PRIMARY T_KEY )? ( T_COMMA idN= getColumnName[tablename] typeN= getDataType )* ( T_COMMA T_PRIMARY T_KEY T_START_PARENTHESIS (idPk1= getColumnName[tablename] | T_START_PARENTHESIS idParK1= getColumnName[tablename] ( T_COMMA idParKN= getColumnName[tablename] )* T_END_PARENTHESIS ) ( T_COMMA idPkN= getColumnName[tablename] )* T_END_PARENTHESIS )? T_END_PARENTHESIS ( T_WITH j= getJson )? ;
	public final CreateTableStatement createTableStatement() throws RecognitionException {
		CreateTableStatement crtast = null;


		Token clusterID=null;
		TableType tableType =null;
		TableName tablename =null;
		ColumnName id1 =null;
		ColumnType type1 =null;
		ColumnName idN =null;
		ColumnType typeN =null;
		ColumnName idPk1 =null;
		ColumnName idParK1 =null;
		ColumnName idParKN =null;
		ColumnName idPkN =null;
		String j =null;


		        LinkedHashMap<ColumnName, ColumnType> columns = new LinkedHashMap<>();
		        LinkedList<ColumnName> partitionKey = new LinkedList<>();
		        LinkedList<ColumnName> clusterKey = new LinkedList<>();
		        boolean ifNotExists = false;
		    
		try {
			// Meta.g:614:6: ( T_CREATE tableType= getTableType T_TABLE ( T_IF T_NOT T_EXISTS )? tablename= getTableName T_ON T_CLUSTER clusterID= T_IDENT T_START_PARENTHESIS id1= getColumnName[tablename] type1= getDataType ( T_PRIMARY T_KEY )? ( T_COMMA idN= getColumnName[tablename] typeN= getDataType )* ( T_COMMA T_PRIMARY T_KEY T_START_PARENTHESIS (idPk1= getColumnName[tablename] | T_START_PARENTHESIS idParK1= getColumnName[tablename] ( T_COMMA idParKN= getColumnName[tablename] )* T_END_PARENTHESIS ) ( T_COMMA idPkN= getColumnName[tablename] )* T_END_PARENTHESIS )? T_END_PARENTHESIS ( T_WITH j= getJson )? )
			// Meta.g:615:5: T_CREATE tableType= getTableType T_TABLE ( T_IF T_NOT T_EXISTS )? tablename= getTableName T_ON T_CLUSTER clusterID= T_IDENT T_START_PARENTHESIS id1= getColumnName[tablename] type1= getDataType ( T_PRIMARY T_KEY )? ( T_COMMA idN= getColumnName[tablename] typeN= getDataType )* ( T_COMMA T_PRIMARY T_KEY T_START_PARENTHESIS (idPk1= getColumnName[tablename] | T_START_PARENTHESIS idParK1= getColumnName[tablename] ( T_COMMA idParKN= getColumnName[tablename] )* T_END_PARENTHESIS ) ( T_COMMA idPkN= getColumnName[tablename] )* T_END_PARENTHESIS )? T_END_PARENTHESIS ( T_WITH j= getJson )?
			{
			match(input,T_CREATE,FOLLOW_T_CREATE_in_createTableStatement4018); 
			pushFollow(FOLLOW_getTableType_in_createTableStatement4022);
			tableType=getTableType();
			state._fsp--;

			match(input,T_TABLE,FOLLOW_T_TABLE_in_createTableStatement4024); 
			// Meta.g:615:45: ( T_IF T_NOT T_EXISTS )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==T_IF) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// Meta.g:615:46: T_IF T_NOT T_EXISTS
					{
					match(input,T_IF,FOLLOW_T_IF_in_createTableStatement4027); 
					match(input,T_NOT,FOLLOW_T_NOT_in_createTableStatement4029); 
					match(input,T_EXISTS,FOLLOW_T_EXISTS_in_createTableStatement4031); 
					ifNotExists = true;
					}
					break;

			}

			pushFollow(FOLLOW_getTableName_in_createTableStatement4043);
			tablename=getTableName();
			state._fsp--;

			match(input,T_ON,FOLLOW_T_ON_in_createTableStatement4049); 
			match(input,T_CLUSTER,FOLLOW_T_CLUSTER_in_createTableStatement4055); 
			clusterID=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_createTableStatement4059); 
			match(input,T_START_PARENTHESIS,FOLLOW_T_START_PARENTHESIS_in_createTableStatement4065); 
			pushFollow(FOLLOW_getColumnName_in_createTableStatement4077);
			id1=getColumnName(tablename);
			state._fsp--;

			pushFollow(FOLLOW_getDataType_in_createTableStatement4082);
			type1=getDataType();
			state._fsp--;

			// Meta.g:620:56: ( T_PRIMARY T_KEY )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==T_PRIMARY) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// Meta.g:620:57: T_PRIMARY T_KEY
					{
					match(input,T_PRIMARY,FOLLOW_T_PRIMARY_in_createTableStatement4085); 
					match(input,T_KEY,FOLLOW_T_KEY_in_createTableStatement4087); 
					 partitionKey.add(id1); 
					}
					break;

			}

			 columns.put(id1, type1);
			// Meta.g:621:9: ( T_COMMA idN= getColumnName[tablename] typeN= getDataType )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==T_COMMA) ) {
					int LA27_1 = input.LA(2);
					if ( (LA27_1==T_BOOLEAN||LA27_1==T_CATALOG||LA27_1==T_COUNT||LA27_1==T_CTLG_TBL_COL||(LA27_1 >= T_DAY && LA27_1 <= T_DAYS)||(LA27_1 >= T_HOUR && LA27_1 <= T_IDENT)||LA27_1==T_INT||LA27_1==T_KEY||LA27_1==T_KS_AND_TN||LA27_1==T_LIMIT||(LA27_1 >= T_LUCENE && LA27_1 <= T_MAP)||(LA27_1 >= T_MINS && LA27_1 <= T_MINUTES)||LA27_1==T_OPTIONS||LA27_1==T_PLAN||LA27_1==T_PROCESS||(LA27_1 >= T_SEC && LA27_1 <= T_SECS)||LA27_1==T_STORAGE||LA27_1==T_TEXT||LA27_1==T_TYPE) ) {
						alt27=1;
					}

				}

				switch (alt27) {
				case 1 :
					// Meta.g:621:10: T_COMMA idN= getColumnName[tablename] typeN= getDataType
					{
					match(input,T_COMMA,FOLLOW_T_COMMA_in_createTableStatement4105); 
					pushFollow(FOLLOW_getColumnName_in_createTableStatement4109);
					idN=getColumnName(tablename);
					state._fsp--;

					pushFollow(FOLLOW_getDataType_in_createTableStatement4114);
					typeN=getDataType();
					state._fsp--;

					 columns.put(idN, typeN); 
					}
					break;

				default :
					break loop27;
				}
			}

			// Meta.g:622:9: ( T_COMMA T_PRIMARY T_KEY T_START_PARENTHESIS (idPk1= getColumnName[tablename] | T_START_PARENTHESIS idParK1= getColumnName[tablename] ( T_COMMA idParKN= getColumnName[tablename] )* T_END_PARENTHESIS ) ( T_COMMA idPkN= getColumnName[tablename] )* T_END_PARENTHESIS )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==T_COMMA) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// Meta.g:622:10: T_COMMA T_PRIMARY T_KEY T_START_PARENTHESIS (idPk1= getColumnName[tablename] | T_START_PARENTHESIS idParK1= getColumnName[tablename] ( T_COMMA idParKN= getColumnName[tablename] )* T_END_PARENTHESIS ) ( T_COMMA idPkN= getColumnName[tablename] )* T_END_PARENTHESIS
					{
					match(input,T_COMMA,FOLLOW_T_COMMA_in_createTableStatement4130); 
					match(input,T_PRIMARY,FOLLOW_T_PRIMARY_in_createTableStatement4132); 
					match(input,T_KEY,FOLLOW_T_KEY_in_createTableStatement4134); 
					match(input,T_START_PARENTHESIS,FOLLOW_T_START_PARENTHESIS_in_createTableStatement4136); 
					// Meta.g:623:17: (idPk1= getColumnName[tablename] | T_START_PARENTHESIS idParK1= getColumnName[tablename] ( T_COMMA idParKN= getColumnName[tablename] )* T_END_PARENTHESIS )
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==T_BOOLEAN||LA29_0==T_CATALOG||LA29_0==T_COUNT||LA29_0==T_CTLG_TBL_COL||(LA29_0 >= T_DAY && LA29_0 <= T_DAYS)||(LA29_0 >= T_HOUR && LA29_0 <= T_IDENT)||LA29_0==T_INT||LA29_0==T_KEY||LA29_0==T_KS_AND_TN||LA29_0==T_LIMIT||(LA29_0 >= T_LUCENE && LA29_0 <= T_MAP)||(LA29_0 >= T_MINS && LA29_0 <= T_MINUTES)||LA29_0==T_OPTIONS||LA29_0==T_PLAN||LA29_0==T_PROCESS||(LA29_0 >= T_SEC && LA29_0 <= T_SECS)||LA29_0==T_STORAGE||LA29_0==T_TEXT||LA29_0==T_TYPE) ) {
						alt29=1;
					}
					else if ( (LA29_0==T_START_PARENTHESIS) ) {
						alt29=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 29, 0, input);
						throw nvae;
					}

					switch (alt29) {
						case 1 :
							// Meta.g:623:18: idPk1= getColumnName[tablename]
							{
							pushFollow(FOLLOW_getColumnName_in_createTableStatement4157);
							idPk1=getColumnName(tablename);
							state._fsp--;

							 if(!partitionKey.isEmpty()) throwParsingException("Partition key was previously defined");
							                                                 partitionKey.add(idPk1); 
							}
							break;
						case 2 :
							// Meta.g:625:19: T_START_PARENTHESIS idParK1= getColumnName[tablename] ( T_COMMA idParKN= getColumnName[tablename] )* T_END_PARENTHESIS
							{
							match(input,T_START_PARENTHESIS,FOLLOW_T_START_PARENTHESIS_in_createTableStatement4180); 
							pushFollow(FOLLOW_getColumnName_in_createTableStatement4204);
							idParK1=getColumnName(tablename);
							state._fsp--;

							 if(!partitionKey.isEmpty()) throwParsingException("Partition key was previously defined");
							                                                       partitionKey.add(idParK1); 
							// Meta.g:628:21: ( T_COMMA idParKN= getColumnName[tablename] )*
							loop28:
							while (true) {
								int alt28=2;
								int LA28_0 = input.LA(1);
								if ( (LA28_0==T_COMMA) ) {
									alt28=1;
								}

								switch (alt28) {
								case 1 :
									// Meta.g:628:22: T_COMMA idParKN= getColumnName[tablename]
									{
									match(input,T_COMMA,FOLLOW_T_COMMA_in_createTableStatement4230); 
									pushFollow(FOLLOW_getColumnName_in_createTableStatement4234);
									idParKN=getColumnName(tablename);
									state._fsp--;

									 partitionKey.add(idParKN); 
									}
									break;

								default :
									break loop28;
								}
							}

							match(input,T_END_PARENTHESIS,FOLLOW_T_END_PARENTHESIS_in_createTableStatement4278); 
							}
							break;

					}

					// Meta.g:631:17: ( T_COMMA idPkN= getColumnName[tablename] )*
					loop30:
					while (true) {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( (LA30_0==T_COMMA) ) {
							alt30=1;
						}

						switch (alt30) {
						case 1 :
							// Meta.g:631:18: T_COMMA idPkN= getColumnName[tablename]
							{
							match(input,T_COMMA,FOLLOW_T_COMMA_in_createTableStatement4298); 
							pushFollow(FOLLOW_getColumnName_in_createTableStatement4302);
							idPkN=getColumnName(tablename);
							state._fsp--;

							 clusterKey.add(idPkN); 
							}
							break;

						default :
							break loop30;
						}
					}

					match(input,T_END_PARENTHESIS,FOLLOW_T_END_PARENTHESIS_in_createTableStatement4317); 
					}
					break;

			}

			match(input,T_END_PARENTHESIS,FOLLOW_T_END_PARENTHESIS_in_createTableStatement4325); 
			// Meta.g:633:23: ( T_WITH j= getJson )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==T_WITH) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// Meta.g:633:24: T_WITH j= getJson
					{
					match(input,T_WITH,FOLLOW_T_WITH_in_createTableStatement4328); 
					pushFollow(FOLLOW_getJson_in_createTableStatement4332);
					j=getJson();
					state._fsp--;

					}
					break;

			}


			        if(partitionKey.isEmpty()) throwParsingException("Primary Key definition missing");
			        crtast = new CreateTableStatement(tableType, tablename, new ClusterName((clusterID!=null?clusterID.getText():null)), columns,
			        partitionKey, clusterKey);
			        crtast.setProperties(j);
			        crtast.setIfNotExists(ifNotExists);
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return crtast;
	}
	// $ANTLR end "createTableStatement"



	// $ANTLR start "getTableType"
	// Meta.g:643:1: getTableType returns [TableType tableType] : ( T_EPHEMERAL )? ;
	public final TableType getTableType() throws RecognitionException {
		TableType tableType = null;



		        tableType = TableType.DATABASE;
		    
		try {
			// Meta.g:646:6: ( ( T_EPHEMERAL )? )
			// Meta.g:647:5: ( T_EPHEMERAL )?
			{
			// Meta.g:647:5: ( T_EPHEMERAL )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==T_EPHEMERAL) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// Meta.g:647:7: T_EPHEMERAL
					{
					match(input,T_EPHEMERAL,FOLLOW_T_EPHEMERAL_in_getTableType4366); 
					 tableType = TableType.EPHEMERAL; 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return tableType;
	}
	// $ANTLR end "getTableType"



	// $ANTLR start "alterTableStatement"
	// Meta.g:650:1: alterTableStatement returns [AlterTableStatement altast] : T_ALTER T_TABLE tablename= getTableName ( T_ALTER column= getColumnName[tablename] T_TYPE dataType= getDataType | T_ADD column= getColumnName[tablename] dataType= getDataType | T_DROP column= getColumnName[tablename] | ( T_WITH j= getJson )? ) ;
	public final AlterTableStatement alterTableStatement() throws RecognitionException {
		AlterTableStatement altast = null;


		TableName tablename =null;
		ColumnName column =null;
		ColumnType dataType =null;
		String j =null;


		        int option= 0;
		    
		try {
			// Meta.g:653:6: ( T_ALTER T_TABLE tablename= getTableName ( T_ALTER column= getColumnName[tablename] T_TYPE dataType= getDataType | T_ADD column= getColumnName[tablename] dataType= getDataType | T_DROP column= getColumnName[tablename] | ( T_WITH j= getJson )? ) )
			// Meta.g:654:5: T_ALTER T_TABLE tablename= getTableName ( T_ALTER column= getColumnName[tablename] T_TYPE dataType= getDataType | T_ADD column= getColumnName[tablename] dataType= getDataType | T_DROP column= getColumnName[tablename] | ( T_WITH j= getJson )? )
			{
			match(input,T_ALTER,FOLLOW_T_ALTER_in_alterTableStatement4395); 
			match(input,T_TABLE,FOLLOW_T_TABLE_in_alterTableStatement4397); 
			pushFollow(FOLLOW_getTableName_in_alterTableStatement4401);
			tablename=getTableName();
			state._fsp--;

			// Meta.g:655:5: ( T_ALTER column= getColumnName[tablename] T_TYPE dataType= getDataType | T_ADD column= getColumnName[tablename] dataType= getDataType | T_DROP column= getColumnName[tablename] | ( T_WITH j= getJson )? )
			int alt35=4;
			switch ( input.LA(1) ) {
			case T_ALTER:
				{
				alt35=1;
				}
				break;
			case T_ADD:
				{
				alt35=2;
				}
				break;
			case T_DROP:
				{
				alt35=3;
				}
				break;
			case T_SEMICOLON:
			case T_WITH:
				{
				alt35=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// Meta.g:655:6: T_ALTER column= getColumnName[tablename] T_TYPE dataType= getDataType
					{
					match(input,T_ALTER,FOLLOW_T_ALTER_in_alterTableStatement4408); 
					pushFollow(FOLLOW_getColumnName_in_alterTableStatement4412);
					column=getColumnName(tablename);
					state._fsp--;

					match(input,T_TYPE,FOLLOW_T_TYPE_in_alterTableStatement4415); 
					pushFollow(FOLLOW_getDataType_in_alterTableStatement4419);
					dataType=getDataType();
					state._fsp--;

					option=1;
					}
					break;
				case 2 :
					// Meta.g:656:10: T_ADD column= getColumnName[tablename] dataType= getDataType
					{
					match(input,T_ADD,FOLLOW_T_ADD_in_alterTableStatement4432); 
					pushFollow(FOLLOW_getColumnName_in_alterTableStatement4436);
					column=getColumnName(tablename);
					state._fsp--;

					pushFollow(FOLLOW_getDataType_in_alterTableStatement4441);
					dataType=getDataType();
					state._fsp--;

					option=2;
					}
					break;
				case 3 :
					// Meta.g:657:10: T_DROP column= getColumnName[tablename]
					{
					match(input,T_DROP,FOLLOW_T_DROP_in_alterTableStatement4454); 
					pushFollow(FOLLOW_getColumnName_in_alterTableStatement4458);
					column=getColumnName(tablename);
					state._fsp--;

					option=3;
					}
					break;
				case 4 :
					// Meta.g:658:10: ( T_WITH j= getJson )?
					{
					// Meta.g:658:10: ( T_WITH j= getJson )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==T_WITH) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// Meta.g:658:11: T_WITH j= getJson
							{
							match(input,T_WITH,FOLLOW_T_WITH_in_alterTableStatement4473); 
							option=4;
							pushFollow(FOLLOW_getJson_in_alterTableStatement4479);
							j=getJson();
							state._fsp--;

							}
							break;

					}

					}
					break;

			}

			altast = new AlterTableStatement(tablename, column, dataType, j, option);  
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return altast;
	}
	// $ANTLR end "alterTableStatement"



	// $ANTLR start "selectStatement"
	// Meta.g:663:1: selectStatement returns [SelectStatement slctst] : T_SELECT selClause= getSelectExpression[fieldsAliasesMap] T_FROM tablename= getAliasedTableID[tablesAliasesMap] ( T_WITH T_WINDOW window= getWindow )? ( T_INNER T_JOIN identJoin= getAliasedTableID[tablesAliasesMap] T_ON joinRelations= getWhereClauses[null] )? ( T_WHERE whereClauses= getWhereClauses[null] )? ( T_ORDER T_BY orderBy= getOrdering[null] )? ( T_GROUP T_BY groupBy= getGroupBy[null] )? ( T_LIMIT constant= T_CONSTANT )? ;
	public final SelectStatement selectStatement() throws RecognitionException {
		SelectStatement slctst = null;


		Token constant=null;
		SelectExpression selClause =null;
		TableName tablename =null;
		Window window =null;
		TableName identJoin =null;
		ArrayList<Relation> joinRelations =null;
		ArrayList<Relation> whereClauses =null;
		OrderBy orderBy =null;
		ArrayList<Selector> groupBy =null;


		        boolean windowInc = false;
		        boolean joinInc = false;
		        boolean whereInc = false;
		        boolean orderInc = false;
		        boolean groupInc = false;
		        boolean limitInc = false;
		        Map fieldsAliasesMap = new LinkedHashMap<String, String>();
		        Map tablesAliasesMap = new LinkedHashMap<String, String>();
		        MutablePair<String, String> pair = new MutablePair<>();
		    
		try {
			// Meta.g:678:6: ( T_SELECT selClause= getSelectExpression[fieldsAliasesMap] T_FROM tablename= getAliasedTableID[tablesAliasesMap] ( T_WITH T_WINDOW window= getWindow )? ( T_INNER T_JOIN identJoin= getAliasedTableID[tablesAliasesMap] T_ON joinRelations= getWhereClauses[null] )? ( T_WHERE whereClauses= getWhereClauses[null] )? ( T_ORDER T_BY orderBy= getOrdering[null] )? ( T_GROUP T_BY groupBy= getGroupBy[null] )? ( T_LIMIT constant= T_CONSTANT )? )
			// Meta.g:679:5: T_SELECT selClause= getSelectExpression[fieldsAliasesMap] T_FROM tablename= getAliasedTableID[tablesAliasesMap] ( T_WITH T_WINDOW window= getWindow )? ( T_INNER T_JOIN identJoin= getAliasedTableID[tablesAliasesMap] T_ON joinRelations= getWhereClauses[null] )? ( T_WHERE whereClauses= getWhereClauses[null] )? ( T_ORDER T_BY orderBy= getOrdering[null] )? ( T_GROUP T_BY groupBy= getGroupBy[null] )? ( T_LIMIT constant= T_CONSTANT )?
			{
			match(input,T_SELECT,FOLLOW_T_SELECT_in_selectStatement4525); 
			pushFollow(FOLLOW_getSelectExpression_in_selectStatement4529);
			selClause=getSelectExpression(fieldsAliasesMap);
			state._fsp--;

			match(input,T_FROM,FOLLOW_T_FROM_in_selectStatement4532); 
			pushFollow(FOLLOW_getAliasedTableID_in_selectStatement4536);
			tablename=getAliasedTableID(tablesAliasesMap);
			state._fsp--;

			// Meta.g:680:5: ( T_WITH T_WINDOW window= getWindow )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==T_WITH) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// Meta.g:680:6: T_WITH T_WINDOW window= getWindow
					{
					match(input,T_WITH,FOLLOW_T_WITH_in_selectStatement4544); 
					match(input,T_WINDOW,FOLLOW_T_WINDOW_in_selectStatement4546); 
					windowInc = true;
					pushFollow(FOLLOW_getWindow_in_selectStatement4552);
					window=getWindow();
					state._fsp--;

					}
					break;

			}

			// Meta.g:681:5: ( T_INNER T_JOIN identJoin= getAliasedTableID[tablesAliasesMap] T_ON joinRelations= getWhereClauses[null] )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==T_INNER) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// Meta.g:681:6: T_INNER T_JOIN identJoin= getAliasedTableID[tablesAliasesMap] T_ON joinRelations= getWhereClauses[null]
					{
					match(input,T_INNER,FOLLOW_T_INNER_in_selectStatement4561); 
					match(input,T_JOIN,FOLLOW_T_JOIN_in_selectStatement4563); 
					 joinInc = true;
					pushFollow(FOLLOW_getAliasedTableID_in_selectStatement4569);
					identJoin=getAliasedTableID(tablesAliasesMap);
					state._fsp--;

					match(input,T_ON,FOLLOW_T_ON_in_selectStatement4572); 
					pushFollow(FOLLOW_getWhereClauses_in_selectStatement4576);
					joinRelations=getWhereClauses(null);
					state._fsp--;

					}
					break;

			}

			// Meta.g:682:5: ( T_WHERE whereClauses= getWhereClauses[null] )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==T_WHERE) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// Meta.g:682:6: T_WHERE whereClauses= getWhereClauses[null]
					{
					match(input,T_WHERE,FOLLOW_T_WHERE_in_selectStatement4586); 
					whereInc = true;
					pushFollow(FOLLOW_getWhereClauses_in_selectStatement4592);
					whereClauses=getWhereClauses(null);
					state._fsp--;

					}
					break;

			}

			// Meta.g:683:5: ( T_ORDER T_BY orderBy= getOrdering[null] )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==T_ORDER) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// Meta.g:683:6: T_ORDER T_BY orderBy= getOrdering[null]
					{
					match(input,T_ORDER,FOLLOW_T_ORDER_in_selectStatement4602); 
					match(input,T_BY,FOLLOW_T_BY_in_selectStatement4604); 
					orderInc = true;
					pushFollow(FOLLOW_getOrdering_in_selectStatement4610);
					orderBy=getOrdering(null);
					state._fsp--;

					}
					break;

			}

			// Meta.g:684:5: ( T_GROUP T_BY groupBy= getGroupBy[null] )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==T_GROUP) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// Meta.g:684:6: T_GROUP T_BY groupBy= getGroupBy[null]
					{
					match(input,T_GROUP,FOLLOW_T_GROUP_in_selectStatement4620); 
					match(input,T_BY,FOLLOW_T_BY_in_selectStatement4622); 
					groupInc = true;
					pushFollow(FOLLOW_getGroupBy_in_selectStatement4628);
					groupBy=getGroupBy(null);
					state._fsp--;

					}
					break;

			}

			// Meta.g:685:5: ( T_LIMIT constant= T_CONSTANT )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==T_LIMIT) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// Meta.g:685:6: T_LIMIT constant= T_CONSTANT
					{
					match(input,T_LIMIT,FOLLOW_T_LIMIT_in_selectStatement4638); 
					limitInc = true;
					constant=(Token)match(input,T_CONSTANT,FOLLOW_T_CONSTANT_in_selectStatement4644); 
					}
					break;

			}


			        if(!checkWhereClauses(whereClauses)) throwParsingException("Left terms of where clauses must be a column name");
			        slctst = new SelectStatement(selClause, tablename);
			        if(windowInc)
			            slctst.setWindow(window);
			        if(joinInc)
			            slctst.setJoin(new InnerJoin(identJoin, joinRelations));
			        if(whereInc)
			             slctst.setWhere(whereClauses);
			        if(orderInc)
			             slctst.setOrderBy(orderBy);
			        if(groupInc)
			             slctst.setGroupBy(new GroupBy(groupBy));
			        if(limitInc)
			             slctst.setLimit(Integer.parseInt((constant!=null?constant.getText():null)));

			        //slctst.replaceAliasesWithName(fieldsAliasesMap, tablesAliasesMap);
			        //slctst.updateTableNames();
			    
			}


			        slctst.setFieldsAliases(fieldsAliasesMap);
			        slctst.setTablesAliases(tablesAliasesMap);
			    
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return slctst;
	}
	// $ANTLR end "selectStatement"



	// $ANTLR start "insertIntoStatement"
	// Meta.g:707:1: insertIntoStatement returns [InsertIntoStatement nsntst] : T_INSERT T_INTO tablename= getTableName T_START_PARENTHESIS ident1= getColumnName[tablename] ( T_COMMA identN= getColumnName[tablename] )* T_END_PARENTHESIS (selectStmnt= selectStatement | T_VALUES T_START_PARENTHESIS term1= getSelector[tablename] ( T_COMMA termN= getSelector[tablename] )* T_END_PARENTHESIS ) ( T_IF T_NOT T_EXISTS )? ( T_USING opt1= getOption[tablename] ( T_AND optN= getOption[tablename] )* )? ;
	public final InsertIntoStatement insertIntoStatement() throws RecognitionException {
		InsertIntoStatement nsntst = null;


		TableName tablename =null;
		ColumnName ident1 =null;
		ColumnName identN =null;
		SelectStatement selectStmnt =null;
		Selector term1 =null;
		Selector termN =null;
		Option opt1 =null;
		Option optN =null;


		        LinkedList<ColumnName> ids = new LinkedList<>();
		        boolean ifNotExists = false;
		        int typeValues = InsertIntoStatement.TYPE_VALUES_CLAUSE;
		        LinkedList<Selector> cellValues = new LinkedList<>();
		        boolean optsInc = false;
		        LinkedList<Option> options = new LinkedList<>();
		    
		try {
			// Meta.g:715:6: ( T_INSERT T_INTO tablename= getTableName T_START_PARENTHESIS ident1= getColumnName[tablename] ( T_COMMA identN= getColumnName[tablename] )* T_END_PARENTHESIS (selectStmnt= selectStatement | T_VALUES T_START_PARENTHESIS term1= getSelector[tablename] ( T_COMMA termN= getSelector[tablename] )* T_END_PARENTHESIS ) ( T_IF T_NOT T_EXISTS )? ( T_USING opt1= getOption[tablename] ( T_AND optN= getOption[tablename] )* )? )
			// Meta.g:716:5: T_INSERT T_INTO tablename= getTableName T_START_PARENTHESIS ident1= getColumnName[tablename] ( T_COMMA identN= getColumnName[tablename] )* T_END_PARENTHESIS (selectStmnt= selectStatement | T_VALUES T_START_PARENTHESIS term1= getSelector[tablename] ( T_COMMA termN= getSelector[tablename] )* T_END_PARENTHESIS ) ( T_IF T_NOT T_EXISTS )? ( T_USING opt1= getOption[tablename] ( T_AND optN= getOption[tablename] )* )?
			{
			match(input,T_INSERT,FOLLOW_T_INSERT_in_insertIntoStatement4676); 
			match(input,T_INTO,FOLLOW_T_INTO_in_insertIntoStatement4678); 
			pushFollow(FOLLOW_getTableName_in_insertIntoStatement4682);
			tablename=getTableName();
			state._fsp--;

			match(input,T_START_PARENTHESIS,FOLLOW_T_START_PARENTHESIS_in_insertIntoStatement4688); 
			pushFollow(FOLLOW_getColumnName_in_insertIntoStatement4700);
			ident1=getColumnName(tablename);
			state._fsp--;

			ids.add(ident1);
			// Meta.g:718:60: ( T_COMMA identN= getColumnName[tablename] )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==T_COMMA) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// Meta.g:718:61: T_COMMA identN= getColumnName[tablename]
					{
					match(input,T_COMMA,FOLLOW_T_COMMA_in_insertIntoStatement4706); 
					pushFollow(FOLLOW_getColumnName_in_insertIntoStatement4710);
					identN=getColumnName(tablename);
					state._fsp--;

					ids.add(identN);
					}
					break;

				default :
					break loop42;
				}
			}

			match(input,T_END_PARENTHESIS,FOLLOW_T_END_PARENTHESIS_in_insertIntoStatement4721); 
			// Meta.g:720:5: (selectStmnt= selectStatement | T_VALUES T_START_PARENTHESIS term1= getSelector[tablename] ( T_COMMA termN= getSelector[tablename] )* T_END_PARENTHESIS )
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==T_SELECT) ) {
				alt44=1;
			}
			else if ( (LA44_0==T_VALUES) ) {
				alt44=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}

			switch (alt44) {
				case 1 :
					// Meta.g:721:9: selectStmnt= selectStatement
					{
					pushFollow(FOLLOW_selectStatement_in_insertIntoStatement4739);
					selectStmnt=selectStatement();
					state._fsp--;

					typeValues = InsertIntoStatement.TYPE_SELECT_CLAUSE;
					}
					break;
				case 2 :
					// Meta.g:723:9: T_VALUES T_START_PARENTHESIS term1= getSelector[tablename] ( T_COMMA termN= getSelector[tablename] )* T_END_PARENTHESIS
					{
					match(input,T_VALUES,FOLLOW_T_VALUES_in_insertIntoStatement4761); 
					match(input,T_START_PARENTHESIS,FOLLOW_T_START_PARENTHESIS_in_insertIntoStatement4771); 
					pushFollow(FOLLOW_getSelector_in_insertIntoStatement4787);
					term1=getSelector(tablename);
					state._fsp--;

					cellValues.add(term1);
					// Meta.g:726:13: ( T_COMMA termN= getSelector[tablename] )*
					loop43:
					while (true) {
						int alt43=2;
						int LA43_0 = input.LA(1);
						if ( (LA43_0==T_COMMA) ) {
							alt43=1;
						}

						switch (alt43) {
						case 1 :
							// Meta.g:726:14: T_COMMA termN= getSelector[tablename]
							{
							match(input,T_COMMA,FOLLOW_T_COMMA_in_insertIntoStatement4805); 
							pushFollow(FOLLOW_getSelector_in_insertIntoStatement4809);
							termN=getSelector(tablename);
							state._fsp--;

							cellValues.add(termN);
							}
							break;

						default :
							break loop43;
						}
					}

					match(input,T_END_PARENTHESIS,FOLLOW_T_END_PARENTHESIS_in_insertIntoStatement4824); 
					}
					break;

			}

			// Meta.g:729:5: ( T_IF T_NOT T_EXISTS )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==T_IF) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// Meta.g:729:6: T_IF T_NOT T_EXISTS
					{
					match(input,T_IF,FOLLOW_T_IF_in_insertIntoStatement4837); 
					match(input,T_NOT,FOLLOW_T_NOT_in_insertIntoStatement4839); 
					match(input,T_EXISTS,FOLLOW_T_EXISTS_in_insertIntoStatement4841); 
					ifNotExists=true;
					}
					break;

			}

			// Meta.g:730:5: ( T_USING opt1= getOption[tablename] ( T_AND optN= getOption[tablename] )* )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==T_USING) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// Meta.g:731:9: T_USING opt1= getOption[tablename] ( T_AND optN= getOption[tablename] )*
					{
					match(input,T_USING,FOLLOW_T_USING_in_insertIntoStatement4862); 
					optsInc=true;
					pushFollow(FOLLOW_getOption_in_insertIntoStatement4876);
					opt1=getOption(tablename);
					state._fsp--;


					            options.add(opt1);
					        
					// Meta.g:735:9: ( T_AND optN= getOption[tablename] )*
					loop46:
					while (true) {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==T_AND) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// Meta.g:735:10: T_AND optN= getOption[tablename]
							{
							match(input,T_AND,FOLLOW_T_AND_in_insertIntoStatement4890); 
							pushFollow(FOLLOW_getOption_in_insertIntoStatement4894);
							optN=getOption(tablename);
							state._fsp--;

							options.add(optN);
							}
							break;

						default :
							break loop46;
						}
					}

					}
					break;

			}


			        if((!ids.isEmpty()) && (!cellValues.isEmpty()) && (ids.size() != cellValues.size())) throwParsingException("Number of columns and number of values differ");
			        if(typeValues==InsertIntoStatement.TYPE_SELECT_CLAUSE)
			            if(optsInc)
			                nsntst = new InsertIntoStatement(tablename, ids, selectStmnt, ifNotExists, options);
			            else
			                nsntst = new InsertIntoStatement(tablename, ids, selectStmnt, ifNotExists);
			        else
			            if(optsInc)
			                nsntst = new InsertIntoStatement(tablename, ids, cellValues, ifNotExists, options);
			            else
			                nsntst = new InsertIntoStatement(tablename, ids, cellValues, ifNotExists);

			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return nsntst;
	}
	// $ANTLR end "insertIntoStatement"



	// $ANTLR start "explainPlanStatement"
	// Meta.g:753:1: explainPlanStatement returns [ExplainPlanStatement xpplst] : T_EXPLAIN T_PLAN T_FOR parsedStmnt= metaStatement ;
	public final ExplainPlanStatement explainPlanStatement() throws RecognitionException {
		ExplainPlanStatement xpplst = null;


		MetaStatement parsedStmnt =null;

		try {
			// Meta.g:753:59: ( T_EXPLAIN T_PLAN T_FOR parsedStmnt= metaStatement )
			// Meta.g:754:5: T_EXPLAIN T_PLAN T_FOR parsedStmnt= metaStatement
			{
			match(input,T_EXPLAIN,FOLLOW_T_EXPLAIN_in_explainPlanStatement4928); 
			match(input,T_PLAN,FOLLOW_T_PLAN_in_explainPlanStatement4930); 
			match(input,T_FOR,FOLLOW_T_FOR_in_explainPlanStatement4932); 
			pushFollow(FOLLOW_metaStatement_in_explainPlanStatement4936);
			parsedStmnt=metaStatement();
			state._fsp--;

			xpplst = new ExplainPlanStatement(parsedStmnt);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return xpplst;
	}
	// $ANTLR end "explainPlanStatement"



	// $ANTLR start "dropTableStatement"
	// Meta.g:759:1: dropTableStatement returns [DropTableStatement drtbst] : T_DROP T_TABLE ( T_IF T_EXISTS )? identID= getTableName ;
	public final DropTableStatement dropTableStatement() throws RecognitionException {
		DropTableStatement drtbst = null;


		TableName identID =null;


		        boolean ifExists = false;
		    
		try {
			// Meta.g:762:6: ( T_DROP T_TABLE ( T_IF T_EXISTS )? identID= getTableName )
			// Meta.g:763:5: T_DROP T_TABLE ( T_IF T_EXISTS )? identID= getTableName
			{
			match(input,T_DROP,FOLLOW_T_DROP_in_dropTableStatement4967); 
			match(input,T_TABLE,FOLLOW_T_TABLE_in_dropTableStatement4969); 
			// Meta.g:763:20: ( T_IF T_EXISTS )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==T_IF) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// Meta.g:763:21: T_IF T_EXISTS
					{
					match(input,T_IF,FOLLOW_T_IF_in_dropTableStatement4972); 
					match(input,T_EXISTS,FOLLOW_T_EXISTS_in_dropTableStatement4974); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_getTableName_in_dropTableStatement4986);
			identID=getTableName();
			state._fsp--;


			        drtbst = new DropTableStatement(identID, ifExists);
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return drtbst;
	}
	// $ANTLR end "dropTableStatement"



	// $ANTLR start "truncateStatement"
	// Meta.g:769:1: truncateStatement returns [TruncateStatement trst] : T_TRUNCATE tablename= getTableName ;
	public final TruncateStatement truncateStatement() throws RecognitionException {
		TruncateStatement trst = null;


		TableName tablename =null;

		try {
			// Meta.g:769:51: ( T_TRUNCATE tablename= getTableName )
			// Meta.g:770:2: T_TRUNCATE tablename= getTableName
			{
			match(input,T_TRUNCATE,FOLLOW_T_TRUNCATE_in_truncateStatement5001); 
			pushFollow(FOLLOW_getTableName_in_truncateStatement5013);
			tablename=getTableName();
			state._fsp--;


			            trst = new TruncateStatement(tablename);
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return trst;
	}
	// $ANTLR end "truncateStatement"



	// $ANTLR start "metaStatement"
	// Meta.g:776:1: metaStatement returns [MetaStatement st] : ( T_START_BRACKET (gID= getGenericID )? T_END_BRACKET T_COMMA )? (st_nsnt= insertIntoStatement |st_slct= selectStatement |st_crta= createTableStatement |st_altt= alterTableStatement |st_pdtb= updateTableStatement |st_tbdr= dropTableStatement |st_trst= truncateStatement |st_lsst= listStatement |st_stpr= stopProcessStatement |st_xppl= explainPlanStatement |st_adds= addStatement |st_drmn= dropManifestStatement |st_rust= removeUDFStatement |st_dlst= deleteStatement |st_desc= describeStatement |st_crks= createCatalogStatement |st_alks= alterCatalogStatement |st_drks= dropCatalogStatement |st_atcs= attachClusterStatement |st_dtcs= detachClusterStatement |st_alcs= alterClusterStatement |st_atcn= attachConnectorStatement |st_decn= detachConnectorStatement |st_cixs= createIndexStatement |st_dixs= dropIndexStatement |st_crtr= createTriggerStatement |st_drtr= dropTriggerStatement ) ;
	public final MetaStatement metaStatement() throws RecognitionException {
		MetaStatement st = null;


		String gID =null;
		InsertIntoStatement st_nsnt =null;
		SelectStatement st_slct =null;
		CreateTableStatement st_crta =null;
		AlterTableStatement st_altt =null;
		UpdateTableStatement st_pdtb =null;
		DropTableStatement st_tbdr =null;
		TruncateStatement st_trst =null;
		ListStatement st_lsst =null;
		StopProcessStatement st_stpr =null;
		ExplainPlanStatement st_xppl =null;
		AddStatement st_adds =null;
		MetaStatement st_drmn =null;
		RemoveUDFStatement st_rust =null;
		DeleteStatement st_dlst =null;
		DescribeStatement st_desc =null;
		CreateCatalogStatement st_crks =null;
		AlterCatalogStatement st_alks =null;
		DropCatalogStatement st_drks =null;
		AttachClusterStatement st_atcs =null;
		DetachClusterStatement st_dtcs =null;
		AlterClusterStatement st_alcs =null;
		AttachConnectorStatement st_atcn =null;
		DetachConnectorStatement st_decn =null;
		CreateIndexStatement st_cixs =null;
		DropIndexStatement st_dixs =null;
		CreateTriggerStatement st_crtr =null;
		DropTriggerStatement st_drtr =null;

		try {
			// Meta.g:776:41: ( ( T_START_BRACKET (gID= getGenericID )? T_END_BRACKET T_COMMA )? (st_nsnt= insertIntoStatement |st_slct= selectStatement |st_crta= createTableStatement |st_altt= alterTableStatement |st_pdtb= updateTableStatement |st_tbdr= dropTableStatement |st_trst= truncateStatement |st_lsst= listStatement |st_stpr= stopProcessStatement |st_xppl= explainPlanStatement |st_adds= addStatement |st_drmn= dropManifestStatement |st_rust= removeUDFStatement |st_dlst= deleteStatement |st_desc= describeStatement |st_crks= createCatalogStatement |st_alks= alterCatalogStatement |st_drks= dropCatalogStatement |st_atcs= attachClusterStatement |st_dtcs= detachClusterStatement |st_alcs= alterClusterStatement |st_atcn= attachConnectorStatement |st_decn= detachConnectorStatement |st_cixs= createIndexStatement |st_dixs= dropIndexStatement |st_crtr= createTriggerStatement |st_drtr= dropTriggerStatement ) )
			// Meta.g:777:5: ( T_START_BRACKET (gID= getGenericID )? T_END_BRACKET T_COMMA )? (st_nsnt= insertIntoStatement |st_slct= selectStatement |st_crta= createTableStatement |st_altt= alterTableStatement |st_pdtb= updateTableStatement |st_tbdr= dropTableStatement |st_trst= truncateStatement |st_lsst= listStatement |st_stpr= stopProcessStatement |st_xppl= explainPlanStatement |st_adds= addStatement |st_drmn= dropManifestStatement |st_rust= removeUDFStatement |st_dlst= deleteStatement |st_desc= describeStatement |st_crks= createCatalogStatement |st_alks= alterCatalogStatement |st_drks= dropCatalogStatement |st_atcs= attachClusterStatement |st_dtcs= detachClusterStatement |st_alcs= alterClusterStatement |st_atcn= attachConnectorStatement |st_decn= detachConnectorStatement |st_cixs= createIndexStatement |st_dixs= dropIndexStatement |st_crtr= createTriggerStatement |st_drtr= dropTriggerStatement )
			{
			// Meta.g:777:5: ( T_START_BRACKET (gID= getGenericID )? T_END_BRACKET T_COMMA )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==T_START_BRACKET) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// Meta.g:777:6: T_START_BRACKET (gID= getGenericID )? T_END_BRACKET T_COMMA
					{
					match(input,T_START_BRACKET,FOLLOW_T_START_BRACKET_in_metaStatement5032); 
					// Meta.g:778:9: (gID= getGenericID )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==T_BOOLEAN||LA49_0==T_CATALOG||LA49_0==T_COUNT||(LA49_0 >= T_DAY && LA49_0 <= T_DAYS)||(LA49_0 >= T_HOUR && LA49_0 <= T_IDENT)||LA49_0==T_INT||LA49_0==T_KEY||LA49_0==T_LIMIT||(LA49_0 >= T_LUCENE && LA49_0 <= T_MAP)||(LA49_0 >= T_MINS && LA49_0 <= T_MINUTES)||LA49_0==T_OPTIONS||LA49_0==T_PLAN||LA49_0==T_PROCESS||(LA49_0 >= T_SEC && LA49_0 <= T_SECS)||LA49_0==T_STORAGE||LA49_0==T_TEXT||LA49_0==T_TYPE) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// Meta.g:778:11: gID= getGenericID
							{
							pushFollow(FOLLOW_getGenericID_in_metaStatement5046);
							gID=getGenericID();
							state._fsp--;

							 sessionCatalog = gID;
							}
							break;

					}

					match(input,T_END_BRACKET,FOLLOW_T_END_BRACKET_in_metaStatement5057); 
					match(input,T_COMMA,FOLLOW_T_COMMA_in_metaStatement5059); 
					}
					break;

			}

			// Meta.g:780:5: (st_nsnt= insertIntoStatement |st_slct= selectStatement |st_crta= createTableStatement |st_altt= alterTableStatement |st_pdtb= updateTableStatement |st_tbdr= dropTableStatement |st_trst= truncateStatement |st_lsst= listStatement |st_stpr= stopProcessStatement |st_xppl= explainPlanStatement |st_adds= addStatement |st_drmn= dropManifestStatement |st_rust= removeUDFStatement |st_dlst= deleteStatement |st_desc= describeStatement |st_crks= createCatalogStatement |st_alks= alterCatalogStatement |st_drks= dropCatalogStatement |st_atcs= attachClusterStatement |st_dtcs= detachClusterStatement |st_alcs= alterClusterStatement |st_atcn= attachConnectorStatement |st_decn= detachConnectorStatement |st_cixs= createIndexStatement |st_dixs= dropIndexStatement |st_crtr= createTriggerStatement |st_drtr= dropTriggerStatement )
			int alt51=27;
			switch ( input.LA(1) ) {
			case T_INSERT:
				{
				alt51=1;
				}
				break;
			case T_SELECT:
				{
				alt51=2;
				}
				break;
			case T_CREATE:
				{
				switch ( input.LA(2) ) {
				case T_CATALOG:
					{
					alt51=16;
					}
					break;
				case T_TRIGGER:
					{
					alt51=26;
					}
					break;
				case T_EPHEMERAL:
				case T_TABLE:
					{
					alt51=3;
					}
					break;
				case T_CUSTOM:
				case T_DEFAULT:
				case T_FULL_TEXT:
				case T_INDEX:
					{
					alt51=24;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 51, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case T_ALTER:
				{
				switch ( input.LA(2) ) {
				case T_TABLE:
					{
					alt51=4;
					}
					break;
				case T_CATALOG:
					{
					alt51=17;
					}
					break;
				case T_CLUSTER:
					{
					alt51=21;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 51, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case T_UPDATE:
				{
				alt51=5;
				}
				break;
			case T_DROP:
				{
				switch ( input.LA(2) ) {
				case T_TABLE:
					{
					alt51=6;
					}
					break;
				case T_CATALOG:
					{
					alt51=18;
					}
					break;
				case T_INDEX:
					{
					alt51=25;
					}
					break;
				case T_TRIGGER:
					{
					alt51=27;
					}
					break;
				case T_CONNECTOR:
				case T_DATASTORE:
					{
					alt51=12;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 51, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case T_TRUNCATE:
				{
				alt51=7;
				}
				break;
			case T_LIST:
				{
				alt51=8;
				}
				break;
			case T_STOP:
				{
				alt51=9;
				}
				break;
			case T_EXPLAIN:
				{
				alt51=10;
				}
				break;
			case T_ADD:
				{
				alt51=11;
				}
				break;
			case T_REMOVE:
				{
				alt51=13;
				}
				break;
			case T_DELETE:
				{
				alt51=14;
				}
				break;
			case T_DESCRIBE:
				{
				alt51=15;
				}
				break;
			case T_ATTACH:
				{
				int LA51_15 = input.LA(2);
				if ( (LA51_15==T_CLUSTER) ) {
					alt51=19;
				}
				else if ( (LA51_15==T_CONNECTOR) ) {
					alt51=22;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 51, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case T_DETACH:
				{
				int LA51_16 = input.LA(2);
				if ( (LA51_16==T_CLUSTER) ) {
					alt51=20;
				}
				else if ( (LA51_16==T_CONNECTOR) ) {
					alt51=23;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 51, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}
			switch (alt51) {
				case 1 :
					// Meta.g:780:6: st_nsnt= insertIntoStatement
					{
					pushFollow(FOLLOW_insertIntoStatement_in_metaStatement5074);
					st_nsnt=insertIntoStatement();
					state._fsp--;

					 st = st_nsnt;
					}
					break;
				case 2 :
					// Meta.g:781:7: st_slct= selectStatement
					{
					pushFollow(FOLLOW_selectStatement_in_metaStatement5088);
					st_slct=selectStatement();
					state._fsp--;

					 st = st_slct;
					}
					break;
				case 3 :
					// Meta.g:782:7: st_crta= createTableStatement
					{
					pushFollow(FOLLOW_createTableStatement_in_metaStatement5102);
					st_crta=createTableStatement();
					state._fsp--;

					 st = st_crta;
					}
					break;
				case 4 :
					// Meta.g:783:7: st_altt= alterTableStatement
					{
					pushFollow(FOLLOW_alterTableStatement_in_metaStatement5116);
					st_altt=alterTableStatement();
					state._fsp--;

					 st = st_altt;
					}
					break;
				case 5 :
					// Meta.g:784:7: st_pdtb= updateTableStatement
					{
					pushFollow(FOLLOW_updateTableStatement_in_metaStatement5130);
					st_pdtb=updateTableStatement();
					state._fsp--;

					 st = st_pdtb; 
					}
					break;
				case 6 :
					// Meta.g:785:7: st_tbdr= dropTableStatement
					{
					pushFollow(FOLLOW_dropTableStatement_in_metaStatement5144);
					st_tbdr=dropTableStatement();
					state._fsp--;

					 st = st_tbdr; 
					}
					break;
				case 7 :
					// Meta.g:786:7: st_trst= truncateStatement
					{
					pushFollow(FOLLOW_truncateStatement_in_metaStatement5158);
					st_trst=truncateStatement();
					state._fsp--;

					 st = st_trst; 
					}
					break;
				case 8 :
					// Meta.g:787:7: st_lsst= listStatement
					{
					pushFollow(FOLLOW_listStatement_in_metaStatement5172);
					st_lsst=listStatement();
					state._fsp--;

					 st = st_lsst; 
					}
					break;
				case 9 :
					// Meta.g:788:7: st_stpr= stopProcessStatement
					{
					pushFollow(FOLLOW_stopProcessStatement_in_metaStatement5186);
					st_stpr=stopProcessStatement();
					state._fsp--;

					 st = st_stpr; 
					}
					break;
				case 10 :
					// Meta.g:789:7: st_xppl= explainPlanStatement
					{
					pushFollow(FOLLOW_explainPlanStatement_in_metaStatement5200);
					st_xppl=explainPlanStatement();
					state._fsp--;

					 st = st_xppl;
					}
					break;
				case 11 :
					// Meta.g:790:7: st_adds= addStatement
					{
					pushFollow(FOLLOW_addStatement_in_metaStatement5214);
					st_adds=addStatement();
					state._fsp--;

					 st = st_adds; 
					}
					break;
				case 12 :
					// Meta.g:791:7: st_drmn= dropManifestStatement
					{
					pushFollow(FOLLOW_dropManifestStatement_in_metaStatement5228);
					st_drmn=dropManifestStatement();
					state._fsp--;

					 st = st_drmn;
					}
					break;
				case 13 :
					// Meta.g:792:7: st_rust= removeUDFStatement
					{
					pushFollow(FOLLOW_removeUDFStatement_in_metaStatement5242);
					st_rust=removeUDFStatement();
					state._fsp--;

					 st = st_rust; 
					}
					break;
				case 14 :
					// Meta.g:793:7: st_dlst= deleteStatement
					{
					pushFollow(FOLLOW_deleteStatement_in_metaStatement5256);
					st_dlst=deleteStatement();
					state._fsp--;

					 st = st_dlst; 
					}
					break;
				case 15 :
					// Meta.g:794:7: st_desc= describeStatement
					{
					pushFollow(FOLLOW_describeStatement_in_metaStatement5270);
					st_desc=describeStatement();
					state._fsp--;

					 st = st_desc;
					}
					break;
				case 16 :
					// Meta.g:795:7: st_crks= createCatalogStatement
					{
					pushFollow(FOLLOW_createCatalogStatement_in_metaStatement5284);
					st_crks=createCatalogStatement();
					state._fsp--;

					 st = st_crks; 
					}
					break;
				case 17 :
					// Meta.g:796:7: st_alks= alterCatalogStatement
					{
					pushFollow(FOLLOW_alterCatalogStatement_in_metaStatement5298);
					st_alks=alterCatalogStatement();
					state._fsp--;

					 st = st_alks; 
					}
					break;
				case 18 :
					// Meta.g:797:7: st_drks= dropCatalogStatement
					{
					pushFollow(FOLLOW_dropCatalogStatement_in_metaStatement5312);
					st_drks=dropCatalogStatement();
					state._fsp--;

					 st = st_drks ;
					}
					break;
				case 19 :
					// Meta.g:798:7: st_atcs= attachClusterStatement
					{
					pushFollow(FOLLOW_attachClusterStatement_in_metaStatement5326);
					st_atcs=attachClusterStatement();
					state._fsp--;

					 st = st_atcs;
					}
					break;
				case 20 :
					// Meta.g:799:7: st_dtcs= detachClusterStatement
					{
					pushFollow(FOLLOW_detachClusterStatement_in_metaStatement5340);
					st_dtcs=detachClusterStatement();
					state._fsp--;

					st = st_dtcs;
					}
					break;
				case 21 :
					// Meta.g:800:7: st_alcs= alterClusterStatement
					{
					pushFollow(FOLLOW_alterClusterStatement_in_metaStatement5354);
					st_alcs=alterClusterStatement();
					state._fsp--;

					st = st_alcs;
					}
					break;
				case 22 :
					// Meta.g:801:7: st_atcn= attachConnectorStatement
					{
					pushFollow(FOLLOW_attachConnectorStatement_in_metaStatement5368);
					st_atcn=attachConnectorStatement();
					state._fsp--;

					 st = st_atcn;
					}
					break;
				case 23 :
					// Meta.g:802:7: st_decn= detachConnectorStatement
					{
					pushFollow(FOLLOW_detachConnectorStatement_in_metaStatement5382);
					st_decn=detachConnectorStatement();
					state._fsp--;

					 st = st_decn;
					}
					break;
				case 24 :
					// Meta.g:803:7: st_cixs= createIndexStatement
					{
					pushFollow(FOLLOW_createIndexStatement_in_metaStatement5396);
					st_cixs=createIndexStatement();
					state._fsp--;

					 st = st_cixs; 
					}
					break;
				case 25 :
					// Meta.g:804:7: st_dixs= dropIndexStatement
					{
					pushFollow(FOLLOW_dropIndexStatement_in_metaStatement5410);
					st_dixs=dropIndexStatement();
					state._fsp--;

					 st = st_dixs; 
					}
					break;
				case 26 :
					// Meta.g:805:7: st_crtr= createTriggerStatement
					{
					pushFollow(FOLLOW_createTriggerStatement_in_metaStatement5424);
					st_crtr=createTriggerStatement();
					state._fsp--;

					 st = st_crtr; 
					}
					break;
				case 27 :
					// Meta.g:806:7: st_drtr= dropTriggerStatement
					{
					pushFollow(FOLLOW_dropTriggerStatement_in_metaStatement5438);
					st_drtr=dropTriggerStatement();
					state._fsp--;

					 st = st_drtr; 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return st;
	}
	// $ANTLR end "metaStatement"



	// $ANTLR start "query"
	// Meta.g:809:1: query returns [MetaStatement st] : mtst= metaStatement ( T_SEMICOLON )+ EOF ;
	public final MetaStatement query() throws RecognitionException {
		MetaStatement st = null;


		MetaStatement mtst =null;

		try {
			// Meta.g:809:33: (mtst= metaStatement ( T_SEMICOLON )+ EOF )
			// Meta.g:810:2: mtst= metaStatement ( T_SEMICOLON )+ EOF
			{
			pushFollow(FOLLOW_metaStatement_in_query5456);
			mtst=metaStatement();
			state._fsp--;

			// Meta.g:810:21: ( T_SEMICOLON )+
			int cnt52=0;
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==T_SEMICOLON) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// Meta.g:810:22: T_SEMICOLON
					{
					match(input,T_SEMICOLON,FOLLOW_T_SEMICOLON_in_query5459); 
					}
					break;

				default :
					if ( cnt52 >= 1 ) break loop52;
					EarlyExitException eee = new EarlyExitException(52, input);
					throw eee;
				}
				cnt52++;
			}

			match(input,EOF,FOLLOW_EOF_in_query5463); 

					st = mtst;
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return st;
	}
	// $ANTLR end "query"



	// $ANTLR start "getDataType"
	// Meta.g:815:1: getDataType returns [ColumnType dataType] : (ident1= getBasicType |ident1= getCollectionType T_LT ident2= getBasicType T_GT |ident1= getMapType T_LT ident2= getBasicType T_COMMA ident3= getBasicType T_GT ) ;
	public final ColumnType getDataType() throws RecognitionException {
		ColumnType dataType = null;


		ColumnType ident1 =null;
		ColumnType ident2 =null;
		ColumnType ident3 =null;

		try {
			// Meta.g:815:42: ( (ident1= getBasicType |ident1= getCollectionType T_LT ident2= getBasicType T_GT |ident1= getMapType T_LT ident2= getBasicType T_COMMA ident3= getBasicType T_GT ) )
			// Meta.g:816:5: (ident1= getBasicType |ident1= getCollectionType T_LT ident2= getBasicType T_GT |ident1= getMapType T_LT ident2= getBasicType T_COMMA ident3= getBasicType T_GT )
			{
			// Meta.g:816:5: (ident1= getBasicType |ident1= getCollectionType T_LT ident2= getBasicType T_GT |ident1= getMapType T_LT ident2= getBasicType T_COMMA ident3= getBasicType T_GT )
			int alt53=3;
			switch ( input.LA(1) ) {
			case T_BIGINT:
			case T_BOOLEAN:
			case T_DOUBLE:
			case T_FLOAT:
			case T_INT:
			case T_INTEGER:
			case T_TEXT:
			case T_VARCHAR:
				{
				alt53=1;
				}
				break;
			case T_LIST:
			case T_SET:
				{
				alt53=2;
				}
				break;
			case T_MAP:
				{
				alt53=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}
			switch (alt53) {
				case 1 :
					// Meta.g:816:7: ident1= getBasicType
					{
					pushFollow(FOLLOW_getBasicType_in_getDataType5485);
					ident1=getBasicType();
					state._fsp--;

					}
					break;
				case 2 :
					// Meta.g:817:7: ident1= getCollectionType T_LT ident2= getBasicType T_GT
					{
					pushFollow(FOLLOW_getCollectionType_in_getDataType5495);
					ident1=getCollectionType();
					state._fsp--;

					match(input,T_LT,FOLLOW_T_LT_in_getDataType5497); 
					pushFollow(FOLLOW_getBasicType_in_getDataType5501);
					ident2=getBasicType();
					state._fsp--;

					match(input,T_GT,FOLLOW_T_GT_in_getDataType5503); 
					 ident1.setDBCollectionType(ident2); 
					}
					break;
				case 3 :
					// Meta.g:818:7: ident1= getMapType T_LT ident2= getBasicType T_COMMA ident3= getBasicType T_GT
					{
					pushFollow(FOLLOW_getMapType_in_getDataType5515);
					ident1=getMapType();
					state._fsp--;

					match(input,T_LT,FOLLOW_T_LT_in_getDataType5517); 
					pushFollow(FOLLOW_getBasicType_in_getDataType5521);
					ident2=getBasicType();
					state._fsp--;

					match(input,T_COMMA,FOLLOW_T_COMMA_in_getDataType5523); 
					pushFollow(FOLLOW_getBasicType_in_getDataType5527);
					ident3=getBasicType();
					state._fsp--;

					match(input,T_GT,FOLLOW_T_GT_in_getDataType5529); 
					 ident1.setDBMapType(ident2, ident3); 
					}
					break;

			}

			 dataType = ident1; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return dataType;
	}
	// $ANTLR end "getDataType"



	// $ANTLR start "getBasicType"
	// Meta.g:822:1: getBasicType returns [ColumnType dataType] : ( T_BIGINT | T_BOOLEAN | T_DOUBLE | T_FLOAT | T_INT | T_INTEGER | T_TEXT | T_VARCHAR );
	public final ColumnType getBasicType() throws RecognitionException {
		ColumnType dataType = null;


		try {
			// Meta.g:822:43: ( T_BIGINT | T_BOOLEAN | T_DOUBLE | T_FLOAT | T_INT | T_INTEGER | T_TEXT | T_VARCHAR )
			int alt54=8;
			switch ( input.LA(1) ) {
			case T_BIGINT:
				{
				alt54=1;
				}
				break;
			case T_BOOLEAN:
				{
				alt54=2;
				}
				break;
			case T_DOUBLE:
				{
				alt54=3;
				}
				break;
			case T_FLOAT:
				{
				alt54=4;
				}
				break;
			case T_INT:
				{
				alt54=5;
				}
				break;
			case T_INTEGER:
				{
				alt54=6;
				}
				break;
			case T_TEXT:
				{
				alt54=7;
				}
				break;
			case T_VARCHAR:
				{
				alt54=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}
			switch (alt54) {
				case 1 :
					// Meta.g:823:5: T_BIGINT
					{
					match(input,T_BIGINT,FOLLOW_T_BIGINT_in_getBasicType5555); 
					 dataType =ColumnType.BIGINT; 
					}
					break;
				case 2 :
					// Meta.g:824:7: T_BOOLEAN
					{
					match(input,T_BOOLEAN,FOLLOW_T_BOOLEAN_in_getBasicType5565); 
					 dataType =ColumnType.BOOLEAN; 
					}
					break;
				case 3 :
					// Meta.g:825:7: T_DOUBLE
					{
					match(input,T_DOUBLE,FOLLOW_T_DOUBLE_in_getBasicType5575); 
					 dataType =ColumnType.DOUBLE; 
					}
					break;
				case 4 :
					// Meta.g:826:7: T_FLOAT
					{
					match(input,T_FLOAT,FOLLOW_T_FLOAT_in_getBasicType5585); 
					 dataType =ColumnType.FLOAT; 
					}
					break;
				case 5 :
					// Meta.g:827:7: T_INT
					{
					match(input,T_INT,FOLLOW_T_INT_in_getBasicType5595); 
					 dataType =ColumnType.INT; 
					}
					break;
				case 6 :
					// Meta.g:828:7: T_INTEGER
					{
					match(input,T_INTEGER,FOLLOW_T_INTEGER_in_getBasicType5605); 
					 dataType =ColumnType.INT; 
					}
					break;
				case 7 :
					// Meta.g:829:7: T_TEXT
					{
					match(input,T_TEXT,FOLLOW_T_TEXT_in_getBasicType5615); 
					 dataType =ColumnType.TEXT; 
					}
					break;
				case 8 :
					// Meta.g:830:7: T_VARCHAR
					{
					match(input,T_VARCHAR,FOLLOW_T_VARCHAR_in_getBasicType5625); 
					 dataType =ColumnType.VARCHAR; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return dataType;
	}
	// $ANTLR end "getBasicType"



	// $ANTLR start "getCollectionType"
	// Meta.g:833:1: getCollectionType returns [ColumnType dataType] : ( T_SET | T_LIST );
	public final ColumnType getCollectionType() throws RecognitionException {
		ColumnType dataType = null;


		try {
			// Meta.g:833:48: ( T_SET | T_LIST )
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==T_SET) ) {
				alt55=1;
			}
			else if ( (LA55_0==T_LIST) ) {
				alt55=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}

			switch (alt55) {
				case 1 :
					// Meta.g:834:5: T_SET
					{
					match(input,T_SET,FOLLOW_T_SET_in_getCollectionType5643); 
					 dataType = ColumnType.SET; 
					}
					break;
				case 2 :
					// Meta.g:835:7: T_LIST
					{
					match(input,T_LIST,FOLLOW_T_LIST_in_getCollectionType5653); 
					 dataType = ColumnType.LIST; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return dataType;
	}
	// $ANTLR end "getCollectionType"



	// $ANTLR start "getMapType"
	// Meta.g:838:1: getMapType returns [ColumnType dataType] : T_MAP ;
	public final ColumnType getMapType() throws RecognitionException {
		ColumnType dataType = null;


		try {
			// Meta.g:838:41: ( T_MAP )
			// Meta.g:839:5: T_MAP
			{
			match(input,T_MAP,FOLLOW_T_MAP_in_getMapType5671); 
			 dataType = ColumnType.MAP; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return dataType;
	}
	// $ANTLR end "getMapType"



	// $ANTLR start "getOrdering"
	// Meta.g:842:1: getOrdering[TableName tablename] returns [OrderBy orderBy] : ident1= getSelector[tablename] ( T_COMMA identN= getSelector[tablename] )* ( T_ASC | T_DESC )? ;
	public final OrderBy getOrdering(TableName tablename) throws RecognitionException {
		OrderBy orderBy = null;


		Selector ident1 =null;
		Selector identN =null;


		        List<Selector> selectorListOrder = new ArrayList<>();
		        OrderDirection direction = OrderDirection.ASC;
		    
		try {
			// Meta.g:849:6: (ident1= getSelector[tablename] ( T_COMMA identN= getSelector[tablename] )* ( T_ASC | T_DESC )? )
			// Meta.g:850:5: ident1= getSelector[tablename] ( T_COMMA identN= getSelector[tablename] )* ( T_ASC | T_DESC )?
			{
			pushFollow(FOLLOW_getSelector_in_getOrdering5708);
			ident1=getSelector(tablename);
			state._fsp--;

			selectorListOrder.add(ident1);
			// Meta.g:851:5: ( T_COMMA identN= getSelector[tablename] )*
			loop56:
			while (true) {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==T_COMMA) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// Meta.g:851:6: T_COMMA identN= getSelector[tablename]
					{
					match(input,T_COMMA,FOLLOW_T_COMMA_in_getOrdering5718); 
					pushFollow(FOLLOW_getSelector_in_getOrdering5722);
					identN=getSelector(tablename);
					state._fsp--;

					selectorListOrder.add(identN);
					}
					break;

				default :
					break loop56;
				}
			}

			// Meta.g:852:5: ( T_ASC | T_DESC )?
			int alt57=3;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==T_ASC) ) {
				alt57=1;
			}
			else if ( (LA57_0==T_DESC) ) {
				alt57=2;
			}
			switch (alt57) {
				case 1 :
					// Meta.g:852:6: T_ASC
					{
					match(input,T_ASC,FOLLOW_T_ASC_in_getOrdering5734); 
					}
					break;
				case 2 :
					// Meta.g:852:14: T_DESC
					{
					match(input,T_DESC,FOLLOW_T_DESC_in_getOrdering5738); 
					 direction = OrderDirection.DESC; 
					}
					break;

			}

			}


			        orderBy = new OrderBy(direction, selectorListOrder);
			    
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return orderBy;
	}
	// $ANTLR end "getOrdering"



	// $ANTLR start "getGroupBy"
	// Meta.g:855:1: getGroupBy[TableName tablename] returns [ArrayList<Selector> groups] : ident1= getSelector[tablename] ( T_COMMA identN= getSelector[tablename] )* ;
	public final ArrayList<Selector> getGroupBy(TableName tablename) throws RecognitionException {
		ArrayList<Selector> groups = null;


		Selector ident1 =null;
		Selector identN =null;


		        groups = new ArrayList<>();
		    
		try {
			// Meta.g:858:6: (ident1= getSelector[tablename] ( T_COMMA identN= getSelector[tablename] )* )
			// Meta.g:859:5: ident1= getSelector[tablename] ( T_COMMA identN= getSelector[tablename] )*
			{
			pushFollow(FOLLOW_getSelector_in_getGroupBy5770);
			ident1=getSelector(tablename);
			state._fsp--;

			groups.add(ident1);
			// Meta.g:860:5: ( T_COMMA identN= getSelector[tablename] )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==T_COMMA) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// Meta.g:860:6: T_COMMA identN= getSelector[tablename]
					{
					match(input,T_COMMA,FOLLOW_T_COMMA_in_getGroupBy5780); 
					pushFollow(FOLLOW_getSelector_in_getGroupBy5784);
					identN=getSelector(tablename);
					state._fsp--;

					groups.add(identN);
					}
					break;

				default :
					break loop58;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return groups;
	}
	// $ANTLR end "getGroupBy"



	// $ANTLR start "getWhereClauses"
	// Meta.g:863:1: getWhereClauses[TableName tablename] returns [ArrayList<Relation> clauses] : ( T_START_PARENTHESIS rel1= getRelation[tablename] ( T_AND wcs= getWhereClauses[tablename] )* T_END_PARENTHESIS ( T_AND wcs= getWhereClauses[tablename] )* |rel1= getRelation[tablename] ( T_AND wcs= getWhereClauses[tablename] )* );
	public final ArrayList<Relation> getWhereClauses(TableName tablename) throws RecognitionException {
		ArrayList<Relation> clauses = null;


		Relation rel1 =null;
		ArrayList<Relation> wcs =null;


		        clauses = new ArrayList<>();
		    
		try {
			// Meta.g:866:6: ( T_START_PARENTHESIS rel1= getRelation[tablename] ( T_AND wcs= getWhereClauses[tablename] )* T_END_PARENTHESIS ( T_AND wcs= getWhereClauses[tablename] )* |rel1= getRelation[tablename] ( T_AND wcs= getWhereClauses[tablename] )* )
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==T_START_PARENTHESIS) ) {
				alt62=1;
			}
			else if ( (LA62_0==QUOTED_LITERAL||LA62_0==T_AVG||LA62_0==T_BOOLEAN||LA62_0==T_CATALOG||(LA62_0 >= T_CONSTANT && LA62_0 <= T_COUNT)||LA62_0==T_CTLG_TBL_COL||(LA62_0 >= T_DAY && LA62_0 <= T_DAYS)||(LA62_0 >= T_FALSE && LA62_0 <= T_FLOAT)||(LA62_0 >= T_HOUR && LA62_0 <= T_IDENT)||LA62_0==T_INT||LA62_0==T_KEY||LA62_0==T_KS_AND_TN||LA62_0==T_LIMIT||(LA62_0 >= T_LUCENE && LA62_0 <= T_MAP)||(LA62_0 >= T_MAX && LA62_0 <= T_MINUTES)||LA62_0==T_OPTIONS||LA62_0==T_PLAN||LA62_0==T_PROCESS||(LA62_0 >= T_SEC && LA62_0 <= T_SECS)||LA62_0==T_STORAGE||LA62_0==T_SUM||LA62_0==T_TEXT||LA62_0==T_TRUE||LA62_0==T_TYPE) ) {
				alt62=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}

			switch (alt62) {
				case 1 :
					// Meta.g:867:5: T_START_PARENTHESIS rel1= getRelation[tablename] ( T_AND wcs= getWhereClauses[tablename] )* T_END_PARENTHESIS ( T_AND wcs= getWhereClauses[tablename] )*
					{
					match(input,T_START_PARENTHESIS,FOLLOW_T_START_PARENTHESIS_in_getWhereClauses5814); 
					pushFollow(FOLLOW_getRelation_in_getWhereClauses5818);
					rel1=getRelation(tablename);
					state._fsp--;

					clauses.add(rel1);
					// Meta.g:867:74: ( T_AND wcs= getWhereClauses[tablename] )*
					loop59:
					while (true) {
						int alt59=2;
						int LA59_0 = input.LA(1);
						if ( (LA59_0==T_AND) ) {
							alt59=1;
						}

						switch (alt59) {
						case 1 :
							// Meta.g:867:75: T_AND wcs= getWhereClauses[tablename]
							{
							match(input,T_AND,FOLLOW_T_AND_in_getWhereClauses5824); 
							pushFollow(FOLLOW_getWhereClauses_in_getWhereClauses5828);
							wcs=getWhereClauses(tablename);
							state._fsp--;

							clauses.addAll(wcs);
							}
							break;

						default :
							break loop59;
						}
					}

					match(input,T_END_PARENTHESIS,FOLLOW_T_END_PARENTHESIS_in_getWhereClauses5835); 
					// Meta.g:867:155: ( T_AND wcs= getWhereClauses[tablename] )*
					loop60:
					while (true) {
						int alt60=2;
						int LA60_0 = input.LA(1);
						if ( (LA60_0==T_AND) ) {
							alt60=1;
						}

						switch (alt60) {
						case 1 :
							// Meta.g:867:156: T_AND wcs= getWhereClauses[tablename]
							{
							match(input,T_AND,FOLLOW_T_AND_in_getWhereClauses5838); 
							pushFollow(FOLLOW_getWhereClauses_in_getWhereClauses5842);
							wcs=getWhereClauses(tablename);
							state._fsp--;

							clauses.addAll(wcs);
							}
							break;

						default :
							break loop60;
						}
					}

					}
					break;
				case 2 :
					// Meta.g:868:7: rel1= getRelation[tablename] ( T_AND wcs= getWhereClauses[tablename] )*
					{
					pushFollow(FOLLOW_getRelation_in_getWhereClauses5857);
					rel1=getRelation(tablename);
					state._fsp--;

					clauses.add(rel1);
					// Meta.g:868:56: ( T_AND wcs= getWhereClauses[tablename] )*
					loop61:
					while (true) {
						int alt61=2;
						int LA61_0 = input.LA(1);
						if ( (LA61_0==T_AND) ) {
							alt61=1;
						}

						switch (alt61) {
						case 1 :
							// Meta.g:868:57: T_AND wcs= getWhereClauses[tablename]
							{
							match(input,T_AND,FOLLOW_T_AND_in_getWhereClauses5863); 
							pushFollow(FOLLOW_getWhereClauses_in_getWhereClauses5867);
							wcs=getWhereClauses(tablename);
							state._fsp--;

							clauses.addAll(wcs);
							}
							break;

						default :
							break loop61;
						}
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return clauses;
	}
	// $ANTLR end "getWhereClauses"



	// $ANTLR start "getRelation"
	// Meta.g:871:1: getRelation[TableName tablename] returns [Relation mrel] : s= getSelector[tablename] operator= getComparator rs= getSelector[tablename] ;
	public final Relation getRelation(TableName tablename) throws RecognitionException {
		Relation mrel = null;


		Selector s =null;
		Operator operator =null;
		Selector rs =null;

		try {
			// Meta.g:874:6: (s= getSelector[tablename] operator= getComparator rs= getSelector[tablename] )
			// Meta.g:875:5: s= getSelector[tablename] operator= getComparator rs= getSelector[tablename]
			{
			pushFollow(FOLLOW_getSelector_in_getRelation5899);
			s=getSelector(tablename);
			state._fsp--;

			pushFollow(FOLLOW_getComparator_in_getRelation5904);
			operator=getComparator();
			state._fsp--;

			pushFollow(FOLLOW_getSelector_in_getRelation5908);
			rs=getSelector(tablename);
			state._fsp--;

			}


			        mrel = new Relation(s, operator, rs);
			    
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return mrel;
	}
	// $ANTLR end "getRelation"



	// $ANTLR start "getFields"
	// Meta.g:878:1: getFields[MutablePair pair] : (ident1L= getTableName T_EQUAL ident1R= getTableName | T_START_PARENTHESIS ident1L= getTableName T_EQUAL ident1R= getTableName T_END_PARENTHESIS );
	public final void getFields(MutablePair pair) throws RecognitionException {
		TableName ident1L =null;
		TableName ident1R =null;

		try {
			// Meta.g:878:28: (ident1L= getTableName T_EQUAL ident1R= getTableName | T_START_PARENTHESIS ident1L= getTableName T_EQUAL ident1R= getTableName T_END_PARENTHESIS )
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==T_BOOLEAN||LA63_0==T_CATALOG||LA63_0==T_COUNT||(LA63_0 >= T_DAY && LA63_0 <= T_DAYS)||(LA63_0 >= T_HOUR && LA63_0 <= T_IDENT)||LA63_0==T_INT||LA63_0==T_KEY||LA63_0==T_KS_AND_TN||LA63_0==T_LIMIT||(LA63_0 >= T_LUCENE && LA63_0 <= T_MAP)||(LA63_0 >= T_MINS && LA63_0 <= T_MINUTES)||LA63_0==T_OPTIONS||LA63_0==T_PLAN||LA63_0==T_PROCESS||(LA63_0 >= T_SEC && LA63_0 <= T_SECS)||LA63_0==T_STORAGE||LA63_0==T_TEXT||LA63_0==T_TYPE) ) {
				alt63=1;
			}
			else if ( (LA63_0==T_START_PARENTHESIS) ) {
				alt63=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}

			switch (alt63) {
				case 1 :
					// Meta.g:879:5: ident1L= getTableName T_EQUAL ident1R= getTableName
					{
					pushFollow(FOLLOW_getTableName_in_getFields5924);
					ident1L=getTableName();
					state._fsp--;

					 pair.setLeft(ident1L); 
					match(input,T_EQUAL,FOLLOW_T_EQUAL_in_getFields5928); 
					pushFollow(FOLLOW_getTableName_in_getFields5932);
					ident1R=getTableName();
					state._fsp--;

					 pair.setRight(ident1R); 
					}
					break;
				case 2 :
					// Meta.g:880:7: T_START_PARENTHESIS ident1L= getTableName T_EQUAL ident1R= getTableName T_END_PARENTHESIS
					{
					match(input,T_START_PARENTHESIS,FOLLOW_T_START_PARENTHESIS_in_getFields5942); 
					pushFollow(FOLLOW_getTableName_in_getFields5946);
					ident1L=getTableName();
					state._fsp--;

					 pair.setLeft(ident1L); 
					match(input,T_EQUAL,FOLLOW_T_EQUAL_in_getFields5950); 
					pushFollow(FOLLOW_getTableName_in_getFields5954);
					ident1R=getTableName();
					state._fsp--;

					 pair.setRight(ident1R); 
					match(input,T_END_PARENTHESIS,FOLLOW_T_END_PARENTHESIS_in_getFields5958); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "getFields"



	// $ANTLR start "getWindow"
	// Meta.g:883:1: getWindow returns [Window ws] : ( T_LAST |cnstnt= T_CONSTANT ( T_ROWS |unit= getTimeUnit ) ) ;
	public final Window getWindow() throws RecognitionException {
		Window ws = null;


		Token cnstnt=null;
		TimeUnit unit =null;

		try {
			// Meta.g:883:30: ( ( T_LAST |cnstnt= T_CONSTANT ( T_ROWS |unit= getTimeUnit ) ) )
			// Meta.g:884:5: ( T_LAST |cnstnt= T_CONSTANT ( T_ROWS |unit= getTimeUnit ) )
			{
			// Meta.g:884:5: ( T_LAST |cnstnt= T_CONSTANT ( T_ROWS |unit= getTimeUnit ) )
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==T_LAST) ) {
				alt65=1;
			}
			else if ( (LA65_0==T_CONSTANT) ) {
				alt65=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}

			switch (alt65) {
				case 1 :
					// Meta.g:884:6: T_LAST
					{
					match(input,T_LAST,FOLLOW_T_LAST_in_getWindow5975); 
					ws = new Window(WindowType.LAST);
					}
					break;
				case 2 :
					// Meta.g:885:7: cnstnt= T_CONSTANT ( T_ROWS |unit= getTimeUnit )
					{
					cnstnt=(Token)match(input,T_CONSTANT,FOLLOW_T_CONSTANT_in_getWindow5987); 
					// Meta.g:885:25: ( T_ROWS |unit= getTimeUnit )
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( (LA64_0==T_ROWS) ) {
						alt64=1;
					}
					else if ( ((LA64_0 >= T_DAY && LA64_0 <= T_DAYS)||(LA64_0 >= T_HOUR && LA64_0 <= T_HOURS)||(LA64_0 >= T_MIN && LA64_0 <= T_MINS)||LA64_0==T_MINUTES||LA64_0==T_SEC||(LA64_0 >= T_SECONDS && LA64_0 <= T_SECS)) ) {
						alt64=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 64, 0, input);
						throw nvae;
					}

					switch (alt64) {
						case 1 :
							// Meta.g:885:26: T_ROWS
							{
							match(input,T_ROWS,FOLLOW_T_ROWS_in_getWindow5990); 
							ws = new Window(WindowType.NUM_ROWS); ws.setNumRows(Integer.parseInt((cnstnt!=null?cnstnt.getText():null)));
							}
							break;
						case 2 :
							// Meta.g:886:26: unit= getTimeUnit
							{
							pushFollow(FOLLOW_getTimeUnit_in_getWindow6021);
							unit=getTimeUnit();
							state._fsp--;

							ws = new Window(WindowType.TEMPORAL); ws.setTimeWindow(Integer.parseInt((cnstnt!=null?cnstnt.getText():null)), unit);
							}
							break;

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ws;
	}
	// $ANTLR end "getWindow"



	// $ANTLR start "getTimeUnit"
	// Meta.g:891:1: getTimeUnit returns [TimeUnit unit] : ( T_SEC | T_SECS | T_SECONDS | T_MIN | T_MINS | T_MINUTES | T_HOUR | T_HOURS | T_DAY | T_DAYS ) ;
	public final TimeUnit getTimeUnit() throws RecognitionException {
		TimeUnit unit = null;


		try {
			// Meta.g:891:36: ( ( T_SEC | T_SECS | T_SECONDS | T_MIN | T_MINS | T_MINUTES | T_HOUR | T_HOURS | T_DAY | T_DAYS ) )
			// Meta.g:892:5: ( T_SEC | T_SECS | T_SECONDS | T_MIN | T_MINS | T_MINUTES | T_HOUR | T_HOURS | T_DAY | T_DAYS )
			{
			// Meta.g:892:5: ( T_SEC | T_SECS | T_SECONDS | T_MIN | T_MINS | T_MINUTES | T_HOUR | T_HOURS | T_DAY | T_DAYS )
			int alt66=10;
			switch ( input.LA(1) ) {
			case T_SEC:
				{
				alt66=1;
				}
				break;
			case T_SECS:
				{
				alt66=2;
				}
				break;
			case T_SECONDS:
				{
				alt66=3;
				}
				break;
			case T_MIN:
				{
				alt66=4;
				}
				break;
			case T_MINS:
				{
				alt66=5;
				}
				break;
			case T_MINUTES:
				{
				alt66=6;
				}
				break;
			case T_HOUR:
				{
				alt66=7;
				}
				break;
			case T_HOURS:
				{
				alt66=8;
				}
				break;
			case T_DAY:
				{
				alt66=9;
				}
				break;
			case T_DAYS:
				{
				alt66=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}
			switch (alt66) {
				case 1 :
					// Meta.g:892:7: T_SEC
					{
					match(input,T_SEC,FOLLOW_T_SEC_in_getTimeUnit6072); 
					unit =TimeUnit.SECONDS;
					}
					break;
				case 2 :
					// Meta.g:893:7: T_SECS
					{
					match(input,T_SECS,FOLLOW_T_SECS_in_getTimeUnit6082); 
					unit =TimeUnit.SECONDS;
					}
					break;
				case 3 :
					// Meta.g:894:7: T_SECONDS
					{
					match(input,T_SECONDS,FOLLOW_T_SECONDS_in_getTimeUnit6092); 
					unit =TimeUnit.SECONDS;
					}
					break;
				case 4 :
					// Meta.g:895:7: T_MIN
					{
					match(input,T_MIN,FOLLOW_T_MIN_in_getTimeUnit6102); 
					unit =TimeUnit.MINUTES;
					}
					break;
				case 5 :
					// Meta.g:896:7: T_MINS
					{
					match(input,T_MINS,FOLLOW_T_MINS_in_getTimeUnit6112); 
					unit =TimeUnit.MINUTES;
					}
					break;
				case 6 :
					// Meta.g:897:7: T_MINUTES
					{
					match(input,T_MINUTES,FOLLOW_T_MINUTES_in_getTimeUnit6122); 
					unit =TimeUnit.MINUTES;
					}
					break;
				case 7 :
					// Meta.g:898:7: T_HOUR
					{
					match(input,T_HOUR,FOLLOW_T_HOUR_in_getTimeUnit6132); 
					unit =TimeUnit.HOURS;
					}
					break;
				case 8 :
					// Meta.g:899:7: T_HOURS
					{
					match(input,T_HOURS,FOLLOW_T_HOURS_in_getTimeUnit6142); 
					unit =TimeUnit.HOURS;
					}
					break;
				case 9 :
					// Meta.g:900:7: T_DAY
					{
					match(input,T_DAY,FOLLOW_T_DAY_in_getTimeUnit6152); 
					unit =TimeUnit.DAYS;
					}
					break;
				case 10 :
					// Meta.g:901:7: T_DAYS
					{
					match(input,T_DAYS,FOLLOW_T_DAYS_in_getTimeUnit6162); 
					unit =TimeUnit.DAYS;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return unit;
	}
	// $ANTLR end "getTimeUnit"



	// $ANTLR start "getSelectExpression"
	// Meta.g:904:1: getSelectExpression[Map fieldsAliasesMap] returns [SelectExpression se] : ( T_DISTINCT )? ( T_ASTERISK |s= getSelector[null] ( T_AS alias1= getGenericID )? ( T_COMMA s= getSelector[null] ( T_AS aliasN= getGenericID )? )* ) ;
	public final SelectExpression getSelectExpression(Map fieldsAliasesMap) throws RecognitionException {
		SelectExpression se = null;


		Selector s =null;
		String alias1 =null;
		String aliasN =null;


		        boolean distinct = false;
		        List<Selector> selectors = new ArrayList<>();
		    
		try {
			// Meta.g:912:6: ( ( T_DISTINCT )? ( T_ASTERISK |s= getSelector[null] ( T_AS alias1= getGenericID )? ( T_COMMA s= getSelector[null] ( T_AS aliasN= getGenericID )? )* ) )
			// Meta.g:913:5: ( T_DISTINCT )? ( T_ASTERISK |s= getSelector[null] ( T_AS alias1= getGenericID )? ( T_COMMA s= getSelector[null] ( T_AS aliasN= getGenericID )? )* )
			{
			// Meta.g:913:5: ( T_DISTINCT )?
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==T_DISTINCT) ) {
				alt67=1;
			}
			switch (alt67) {
				case 1 :
					// Meta.g:913:6: T_DISTINCT
					{
					match(input,T_DISTINCT,FOLLOW_T_DISTINCT_in_getSelectExpression6199); 
					distinct = true;
					}
					break;

			}

			// Meta.g:914:5: ( T_ASTERISK |s= getSelector[null] ( T_AS alias1= getGenericID )? ( T_COMMA s= getSelector[null] ( T_AS aliasN= getGenericID )? )* )
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==T_ASTERISK) ) {
				alt71=1;
			}
			else if ( (LA71_0==QUOTED_LITERAL||LA71_0==T_AVG||LA71_0==T_BOOLEAN||LA71_0==T_CATALOG||(LA71_0 >= T_CONSTANT && LA71_0 <= T_COUNT)||LA71_0==T_CTLG_TBL_COL||(LA71_0 >= T_DAY && LA71_0 <= T_DAYS)||(LA71_0 >= T_FALSE && LA71_0 <= T_FLOAT)||(LA71_0 >= T_HOUR && LA71_0 <= T_IDENT)||LA71_0==T_INT||LA71_0==T_KEY||LA71_0==T_KS_AND_TN||LA71_0==T_LIMIT||(LA71_0 >= T_LUCENE && LA71_0 <= T_MAP)||(LA71_0 >= T_MAX && LA71_0 <= T_MINUTES)||LA71_0==T_OPTIONS||LA71_0==T_PLAN||LA71_0==T_PROCESS||(LA71_0 >= T_SEC && LA71_0 <= T_SECS)||LA71_0==T_STORAGE||LA71_0==T_SUM||LA71_0==T_TEXT||LA71_0==T_TRUE||LA71_0==T_TYPE) ) {
				alt71=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}

			switch (alt71) {
				case 1 :
					// Meta.g:915:9: T_ASTERISK
					{
					match(input,T_ASTERISK,FOLLOW_T_ASTERISK_in_getSelectExpression6219); 
					 if(distinct) throwParsingException("Selector DISTINCT doesn't accept '*'");
					                     s = new AsteriskSelector(); selectors.add(s);
					}
					break;
				case 2 :
					// Meta.g:917:11: s= getSelector[null] ( T_AS alias1= getGenericID )? ( T_COMMA s= getSelector[null] ( T_AS aliasN= getGenericID )? )*
					{
					pushFollow(FOLLOW_getSelector_in_getSelectExpression6235);
					s=getSelector(null);
					state._fsp--;

					 if(s == null) throwParsingException("Column name not found");
					// Meta.g:918:17: ( T_AS alias1= getGenericID )?
					int alt68=2;
					int LA68_0 = input.LA(1);
					if ( (LA68_0==T_AS) ) {
						alt68=1;
					}
					switch (alt68) {
						case 1 :
							// Meta.g:918:18: T_AS alias1= getGenericID
							{
							match(input,T_AS,FOLLOW_T_AS_in_getSelectExpression6257); 
							pushFollow(FOLLOW_getGenericID_in_getSelectExpression6261);
							alias1=getGenericID();
							state._fsp--;


							                    s.setAlias(alias1);
							                    fieldsAliasesMap.put(alias1, s.toString());
							}
							break;

					}

					selectors.add(s);
					// Meta.g:922:13: ( T_COMMA s= getSelector[null] ( T_AS aliasN= getGenericID )? )*
					loop70:
					while (true) {
						int alt70=2;
						int LA70_0 = input.LA(1);
						if ( (LA70_0==T_COMMA) ) {
							alt70=1;
						}

						switch (alt70) {
						case 1 :
							// Meta.g:922:14: T_COMMA s= getSelector[null] ( T_AS aliasN= getGenericID )?
							{
							match(input,T_COMMA,FOLLOW_T_COMMA_in_getSelectExpression6299); 
							pushFollow(FOLLOW_getSelector_in_getSelectExpression6303);
							s=getSelector(null);
							state._fsp--;

							 if(s == null) throwParsingException("Column name not found");
							// Meta.g:923:21: ( T_AS aliasN= getGenericID )?
							int alt69=2;
							int LA69_0 = input.LA(1);
							if ( (LA69_0==T_AS) ) {
								alt69=1;
							}
							switch (alt69) {
								case 1 :
									// Meta.g:923:22: T_AS aliasN= getGenericID
									{
									match(input,T_AS,FOLLOW_T_AS_in_getSelectExpression6329); 
									pushFollow(FOLLOW_getGenericID_in_getSelectExpression6333);
									aliasN=getGenericID();
									state._fsp--;


									                        s.setAlias(aliasN);
									                        fieldsAliasesMap.put(aliasN, s.toString());
									}
									break;

							}

							selectors.add(s);
							}
							break;

						default :
							break loop70;
						}
					}

					}
					break;

			}

			}


			        se = new SelectExpression(selectors);
			        se.setDistinct(distinct);
			    
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return se;
	}
	// $ANTLR end "getSelectExpression"



	// $ANTLR start "getSelector"
	// Meta.g:930:1: getSelector[TableName tablename] returns [Selector s] : ( (functionName= T_SUM |functionName= T_MAX |functionName= T_MIN |functionName= T_AVG |functionName= T_COUNT |functionName= T_IDENT ) T_START_PARENTHESIS (select1= getSelector[tablename] | T_ASTERISK )? T_END_PARENTHESIS | (columnName= getColumnName[tablename] |floatingNumber= T_FLOAT |constant= T_CONSTANT | T_FALSE | T_TRUE |qLiteral= QUOTED_LITERAL ) ) ;
	public final Selector getSelector(TableName tablename) throws RecognitionException {
		Selector s = null;


		Token functionName=null;
		Token floatingNumber=null;
		Token constant=null;
		Token qLiteral=null;
		Selector select1 =null;
		ColumnName columnName =null;


		        List<Selector> params = new ArrayList<>();
		        String name = null;
		    
		try {
			// Meta.g:934:6: ( ( (functionName= T_SUM |functionName= T_MAX |functionName= T_MIN |functionName= T_AVG |functionName= T_COUNT |functionName= T_IDENT ) T_START_PARENTHESIS (select1= getSelector[tablename] | T_ASTERISK )? T_END_PARENTHESIS | (columnName= getColumnName[tablename] |floatingNumber= T_FLOAT |constant= T_CONSTANT | T_FALSE | T_TRUE |qLiteral= QUOTED_LITERAL ) ) )
			// Meta.g:935:5: ( (functionName= T_SUM |functionName= T_MAX |functionName= T_MIN |functionName= T_AVG |functionName= T_COUNT |functionName= T_IDENT ) T_START_PARENTHESIS (select1= getSelector[tablename] | T_ASTERISK )? T_END_PARENTHESIS | (columnName= getColumnName[tablename] |floatingNumber= T_FLOAT |constant= T_CONSTANT | T_FALSE | T_TRUE |qLiteral= QUOTED_LITERAL ) )
			{
			// Meta.g:935:5: ( (functionName= T_SUM |functionName= T_MAX |functionName= T_MIN |functionName= T_AVG |functionName= T_COUNT |functionName= T_IDENT ) T_START_PARENTHESIS (select1= getSelector[tablename] | T_ASTERISK )? T_END_PARENTHESIS | (columnName= getColumnName[tablename] |floatingNumber= T_FLOAT |constant= T_CONSTANT | T_FALSE | T_TRUE |qLiteral= QUOTED_LITERAL ) )
			int alt75=2;
			switch ( input.LA(1) ) {
			case T_AVG:
			case T_MAX:
			case T_MIN:
			case T_SUM:
				{
				alt75=1;
				}
				break;
			case T_COUNT:
				{
				int LA75_2 = input.LA(2);
				if ( (LA75_2==T_START_PARENTHESIS) ) {
					alt75=1;
				}
				else if ( (LA75_2==EOF||LA75_2==QUOTED_LITERAL||LA75_2==T_AND||(LA75_2 >= T_AS && LA75_2 <= T_ASTERISK)||LA75_2==T_AVG||LA75_2==T_BOOLEAN||LA75_2==T_CATALOG||LA75_2==T_CLUSTERING||(LA75_2 >= T_COLON && LA75_2 <= T_COMPACT)||(LA75_2 >= T_CONSTANT && LA75_2 <= T_COUNT)||LA75_2==T_CTLG_TBL_COL||(LA75_2 >= T_DAY && LA75_2 <= T_DAYS)||LA75_2==T_DESC||(LA75_2 >= T_END_BRACKET && LA75_2 <= T_END_SBRACKET)||LA75_2==T_EQUAL||(LA75_2 >= T_FALSE && LA75_2 <= T_FLOAT)||LA75_2==T_FROM||(LA75_2 >= T_GROUP && LA75_2 <= T_IF)||LA75_2==T_INT||LA75_2==T_KEY||LA75_2==T_KS_AND_TN||(LA75_2 >= T_LIKE && LA75_2 <= T_LIMIT)||(LA75_2 >= T_LT && LA75_2 <= T_MINUTES)||LA75_2==T_NOT_EQUAL||(LA75_2 >= T_OPTIONS && LA75_2 <= T_PLUS)||LA75_2==T_PROCESS||(LA75_2 >= T_SEC && LA75_2 <= T_SECS)||(LA75_2 >= T_SEMICOLON && LA75_2 <= T_SET)||LA75_2==T_SLASH||(LA75_2 >= T_STORAGE && LA75_2 <= T_SUM)||LA75_2==T_TEXT||LA75_2==T_TRUE||LA75_2==T_TYPE||LA75_2==T_USING||LA75_2==T_WHERE) ) {
					alt75=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 75, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case T_IDENT:
				{
				int LA75_3 = input.LA(2);
				if ( (LA75_3==T_START_PARENTHESIS) ) {
					alt75=1;
				}
				else if ( (LA75_3==EOF||LA75_3==QUOTED_LITERAL||LA75_3==T_AND||(LA75_3 >= T_AS && LA75_3 <= T_ASTERISK)||LA75_3==T_AVG||LA75_3==T_BOOLEAN||LA75_3==T_CATALOG||LA75_3==T_CLUSTERING||(LA75_3 >= T_COLON && LA75_3 <= T_COMPACT)||(LA75_3 >= T_CONSTANT && LA75_3 <= T_COUNT)||LA75_3==T_CTLG_TBL_COL||(LA75_3 >= T_DAY && LA75_3 <= T_DAYS)||LA75_3==T_DESC||(LA75_3 >= T_END_BRACKET && LA75_3 <= T_END_SBRACKET)||LA75_3==T_EQUAL||(LA75_3 >= T_FALSE && LA75_3 <= T_FLOAT)||LA75_3==T_FROM||(LA75_3 >= T_GROUP && LA75_3 <= T_IF)||LA75_3==T_INT||LA75_3==T_KEY||LA75_3==T_KS_AND_TN||(LA75_3 >= T_LIKE && LA75_3 <= T_LIMIT)||(LA75_3 >= T_LT && LA75_3 <= T_MINUTES)||LA75_3==T_NOT_EQUAL||(LA75_3 >= T_OPTIONS && LA75_3 <= T_PLUS)||LA75_3==T_PROCESS||(LA75_3 >= T_SEC && LA75_3 <= T_SECS)||(LA75_3 >= T_SEMICOLON && LA75_3 <= T_SET)||LA75_3==T_SLASH||(LA75_3 >= T_STORAGE && LA75_3 <= T_SUM)||LA75_3==T_TEXT||LA75_3==T_TRUE||LA75_3==T_TYPE||LA75_3==T_USING||LA75_3==T_WHERE) ) {
					alt75=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 75, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case QUOTED_LITERAL:
			case T_BOOLEAN:
			case T_CATALOG:
			case T_CONSTANT:
			case T_CTLG_TBL_COL:
			case T_DAY:
			case T_DAYS:
			case T_FALSE:
			case T_FLOAT:
			case T_HOUR:
			case T_HOURS:
			case T_INT:
			case T_KEY:
			case T_KS_AND_TN:
			case T_LIMIT:
			case T_LUCENE:
			case T_MAP:
			case T_MINS:
			case T_MINUTE:
			case T_MINUTES:
			case T_OPTIONS:
			case T_PLAN:
			case T_PROCESS:
			case T_SEC:
			case T_SECOND:
			case T_SECONDS:
			case T_SECS:
			case T_STORAGE:
			case T_TEXT:
			case T_TRUE:
			case T_TYPE:
				{
				alt75=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}
			switch (alt75) {
				case 1 :
					// Meta.g:936:9: (functionName= T_SUM |functionName= T_MAX |functionName= T_MIN |functionName= T_AVG |functionName= T_COUNT |functionName= T_IDENT ) T_START_PARENTHESIS (select1= getSelector[tablename] | T_ASTERISK )? T_END_PARENTHESIS
					{
					// Meta.g:936:9: (functionName= T_SUM |functionName= T_MAX |functionName= T_MIN |functionName= T_AVG |functionName= T_COUNT |functionName= T_IDENT )
					int alt72=6;
					switch ( input.LA(1) ) {
					case T_SUM:
						{
						alt72=1;
						}
						break;
					case T_MAX:
						{
						alt72=2;
						}
						break;
					case T_MIN:
						{
						alt72=3;
						}
						break;
					case T_AVG:
						{
						alt72=4;
						}
						break;
					case T_COUNT:
						{
						alt72=5;
						}
						break;
					case T_IDENT:
						{
						alt72=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 72, 0, input);
						throw nvae;
					}
					switch (alt72) {
						case 1 :
							// Meta.g:936:10: functionName= T_SUM
							{
							functionName=(Token)match(input,T_SUM,FOLLOW_T_SUM_in_getSelector6406); 
							}
							break;
						case 2 :
							// Meta.g:937:15: functionName= T_MAX
							{
							functionName=(Token)match(input,T_MAX,FOLLOW_T_MAX_in_getSelector6424); 
							}
							break;
						case 3 :
							// Meta.g:938:15: functionName= T_MIN
							{
							functionName=(Token)match(input,T_MIN,FOLLOW_T_MIN_in_getSelector6442); 
							}
							break;
						case 4 :
							// Meta.g:939:15: functionName= T_AVG
							{
							functionName=(Token)match(input,T_AVG,FOLLOW_T_AVG_in_getSelector6460); 
							}
							break;
						case 5 :
							// Meta.g:940:15: functionName= T_COUNT
							{
							functionName=(Token)match(input,T_COUNT,FOLLOW_T_COUNT_in_getSelector6478); 
							}
							break;
						case 6 :
							// Meta.g:941:15: functionName= T_IDENT
							{
							functionName=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getSelector6496); 
							}
							break;

					}

					match(input,T_START_PARENTHESIS,FOLLOW_T_START_PARENTHESIS_in_getSelector6516); 
					// Meta.g:944:13: (select1= getSelector[tablename] | T_ASTERISK )?
					int alt73=3;
					int LA73_0 = input.LA(1);
					if ( (LA73_0==QUOTED_LITERAL||LA73_0==T_AVG||LA73_0==T_BOOLEAN||LA73_0==T_CATALOG||(LA73_0 >= T_CONSTANT && LA73_0 <= T_COUNT)||LA73_0==T_CTLG_TBL_COL||(LA73_0 >= T_DAY && LA73_0 <= T_DAYS)||(LA73_0 >= T_FALSE && LA73_0 <= T_FLOAT)||(LA73_0 >= T_HOUR && LA73_0 <= T_IDENT)||LA73_0==T_INT||LA73_0==T_KEY||LA73_0==T_KS_AND_TN||LA73_0==T_LIMIT||(LA73_0 >= T_LUCENE && LA73_0 <= T_MAP)||(LA73_0 >= T_MAX && LA73_0 <= T_MINUTES)||LA73_0==T_OPTIONS||LA73_0==T_PLAN||LA73_0==T_PROCESS||(LA73_0 >= T_SEC && LA73_0 <= T_SECS)||LA73_0==T_STORAGE||LA73_0==T_SUM||LA73_0==T_TEXT||LA73_0==T_TRUE||LA73_0==T_TYPE) ) {
						alt73=1;
					}
					else if ( (LA73_0==T_ASTERISK) ) {
						alt73=2;
					}
					switch (alt73) {
						case 1 :
							// Meta.g:944:14: select1= getSelector[tablename]
							{
							pushFollow(FOLLOW_getSelector_in_getSelector6533);
							select1=getSelector(tablename);
							state._fsp--;

							params.add(select1);
							}
							break;
						case 2 :
							// Meta.g:945:15: T_ASTERISK
							{
							match(input,T_ASTERISK,FOLLOW_T_ASTERISK_in_getSelector6552); 
							params.add(new AsteriskSelector());
							}
							break;

					}

					match(input,T_END_PARENTHESIS,FOLLOW_T_END_PARENTHESIS_in_getSelector6579); 
					 String functionStr = (functionName!=null?functionName.getText():null);
					                            if(functionStr.equalsIgnoreCase("count") && (!params.toString().equalsIgnoreCase("[*]")) && (!params.toString().equalsIgnoreCase("[1]"))) throwParsingException("COUNT function only accepts '*' or '1'");
					                            s = new FunctionSelector(functionStr, params);
					}
					break;
				case 2 :
					// Meta.g:951:9: (columnName= getColumnName[tablename] |floatingNumber= T_FLOAT |constant= T_CONSTANT | T_FALSE | T_TRUE |qLiteral= QUOTED_LITERAL )
					{
					// Meta.g:951:9: (columnName= getColumnName[tablename] |floatingNumber= T_FLOAT |constant= T_CONSTANT | T_FALSE | T_TRUE |qLiteral= QUOTED_LITERAL )
					int alt74=6;
					switch ( input.LA(1) ) {
					case T_BOOLEAN:
					case T_CATALOG:
					case T_COUNT:
					case T_CTLG_TBL_COL:
					case T_DAY:
					case T_DAYS:
					case T_HOUR:
					case T_HOURS:
					case T_IDENT:
					case T_INT:
					case T_KEY:
					case T_KS_AND_TN:
					case T_LIMIT:
					case T_LUCENE:
					case T_MAP:
					case T_MINS:
					case T_MINUTE:
					case T_MINUTES:
					case T_OPTIONS:
					case T_PLAN:
					case T_PROCESS:
					case T_SEC:
					case T_SECOND:
					case T_SECONDS:
					case T_SECS:
					case T_STORAGE:
					case T_TEXT:
					case T_TYPE:
						{
						alt74=1;
						}
						break;
					case T_FLOAT:
						{
						alt74=2;
						}
						break;
					case T_CONSTANT:
						{
						alt74=3;
						}
						break;
					case T_FALSE:
						{
						alt74=4;
						}
						break;
					case T_TRUE:
						{
						alt74=5;
						}
						break;
					case QUOTED_LITERAL:
						{
						alt74=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 74, 0, input);
						throw nvae;
					}
					switch (alt74) {
						case 1 :
							// Meta.g:952:13: columnName= getColumnName[tablename]
							{
							pushFollow(FOLLOW_getColumnName_in_getSelector6617);
							columnName=getColumnName(tablename);
							state._fsp--;

							s = new ColumnSelector(columnName);
							}
							break;
						case 2 :
							// Meta.g:953:15: floatingNumber= T_FLOAT
							{
							floatingNumber=(Token)match(input,T_FLOAT,FOLLOW_T_FLOAT_in_getSelector6638); 
							s = new FloatingPointSelector((floatingNumber!=null?floatingNumber.getText():null));
							}
							break;
						case 3 :
							// Meta.g:954:15: constant= T_CONSTANT
							{
							constant=(Token)match(input,T_CONSTANT,FOLLOW_T_CONSTANT_in_getSelector6658); 
							s = new IntegerSelector((constant!=null?constant.getText():null));
							}
							break;
						case 4 :
							// Meta.g:955:15: T_FALSE
							{
							match(input,T_FALSE,FOLLOW_T_FALSE_in_getSelector6676); 
							s = new BooleanSelector(false);
							}
							break;
						case 5 :
							// Meta.g:956:15: T_TRUE
							{
							match(input,T_TRUE,FOLLOW_T_TRUE_in_getSelector6694); 
							s = new BooleanSelector(true);
							}
							break;
						case 6 :
							// Meta.g:957:15: qLiteral= QUOTED_LITERAL
							{
							qLiteral=(Token)match(input,QUOTED_LITERAL,FOLLOW_QUOTED_LITERAL_in_getSelector6714); 
							s = new StringSelector((qLiteral!=null?qLiteral.getText():null));
							}
							break;

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "getSelector"


	public static class getListTypes_return extends ParserRuleReturnScope {
		public String listType;
	};


	// $ANTLR start "getListTypes"
	// Meta.g:962:1: getListTypes returns [String listType] : tablename= ( T_PROCESS | T_UDF | T_TRIGGER ) ;
	public final MetaParser.getListTypes_return getListTypes() throws RecognitionException {
		MetaParser.getListTypes_return retval = new MetaParser.getListTypes_return();
		retval.start = input.LT(1);

		Token tablename=null;

		try {
			// Meta.g:962:39: (tablename= ( T_PROCESS | T_UDF | T_TRIGGER ) )
			// Meta.g:963:2: tablename= ( T_PROCESS | T_UDF | T_TRIGGER )
			{
			tablename=input.LT(1);
			if ( input.LA(1)==T_PROCESS||input.LA(1)==T_TRIGGER||input.LA(1)==T_UDF ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			retval.listType = new String((tablename!=null?tablename.getText():null));
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "getListTypes"



	// $ANTLR start "getAssignment"
	// Meta.g:966:1: getAssignment[TableName tablename] returns [Relation assign] : leftTerm= getSelector[tablename] T_EQUAL rightTerm= getRightTermInAssignment[tablename] ;
	public final Relation getAssignment(TableName tablename) throws RecognitionException {
		Relation assign = null;


		Selector leftTerm =null;
		Selector rightTerm =null;

		try {
			// Meta.g:969:6: (leftTerm= getSelector[tablename] T_EQUAL rightTerm= getRightTermInAssignment[tablename] )
			// Meta.g:970:5: leftTerm= getSelector[tablename] T_EQUAL rightTerm= getRightTermInAssignment[tablename]
			{
			pushFollow(FOLLOW_getSelector_in_getAssignment6786);
			leftTerm=getSelector(tablename);
			state._fsp--;

			match(input,T_EQUAL,FOLLOW_T_EQUAL_in_getAssignment6789); 
			pushFollow(FOLLOW_getRightTermInAssignment_in_getAssignment6793);
			rightTerm=getRightTermInAssignment(tablename);
			state._fsp--;

			}


			        assign = new Relation(leftTerm, Operator.EQ, rightTerm);
			    
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return assign;
	}
	// $ANTLR end "getAssignment"



	// $ANTLR start "getRightTermInAssignment"
	// Meta.g:974:1: getRightTermInAssignment[TableName tablename] returns [Selector leftSelector] : firstSel= getSelector[tablename] (operator= getOperator secondSel= getRightTermInAssignment[tablename] )? ;
	public final Selector getRightTermInAssignment(TableName tablename) throws RecognitionException {
		Selector leftSelector = null;


		Selector firstSel =null;
		Operator operator =null;
		Selector secondSel =null;


		        boolean relationSelector = false;
		    
		try {
			// Meta.g:983:6: (firstSel= getSelector[tablename] (operator= getOperator secondSel= getRightTermInAssignment[tablename] )? )
			// Meta.g:984:5: firstSel= getSelector[tablename] (operator= getOperator secondSel= getRightTermInAssignment[tablename] )?
			{
			pushFollow(FOLLOW_getSelector_in_getRightTermInAssignment6830);
			firstSel=getSelector(tablename);
			state._fsp--;

			// Meta.g:984:37: (operator= getOperator secondSel= getRightTermInAssignment[tablename] )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==T_ASTERISK||LA76_0==T_PLUS||LA76_0==T_SLASH||LA76_0==T_SUBTRACT) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// Meta.g:984:38: operator= getOperator secondSel= getRightTermInAssignment[tablename]
					{
					pushFollow(FOLLOW_getOperator_in_getRightTermInAssignment6836);
					operator=getOperator();
					state._fsp--;

					pushFollow(FOLLOW_getRightTermInAssignment_in_getRightTermInAssignment6840);
					secondSel=getRightTermInAssignment(tablename);
					state._fsp--;

					 relationSelector = true; 
					}
					break;

			}

			}


			        if(relationSelector)
			            leftSelector = new RelationSelector(new Relation(firstSel, operator, secondSel));
			        else
			            leftSelector = firstSel;
			    
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return leftSelector;
	}
	// $ANTLR end "getRightTermInAssignment"



	// $ANTLR start "getOperator"
	// Meta.g:988:1: getOperator returns [Operator op] : ( T_PLUS | T_SUBTRACT | T_ASTERISK | T_SLASH );
	public final Operator getOperator() throws RecognitionException {
		Operator op = null;


		try {
			// Meta.g:988:34: ( T_PLUS | T_SUBTRACT | T_ASTERISK | T_SLASH )
			int alt77=4;
			switch ( input.LA(1) ) {
			case T_PLUS:
				{
				alt77=1;
				}
				break;
			case T_SUBTRACT:
				{
				alt77=2;
				}
				break;
			case T_ASTERISK:
				{
				alt77=3;
				}
				break;
			case T_SLASH:
				{
				alt77=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}
			switch (alt77) {
				case 1 :
					// Meta.g:989:5: T_PLUS
					{
					match(input,T_PLUS,FOLLOW_T_PLUS_in_getOperator6866); 
					op = Operator.ADD;
					}
					break;
				case 2 :
					// Meta.g:990:7: T_SUBTRACT
					{
					match(input,T_SUBTRACT,FOLLOW_T_SUBTRACT_in_getOperator6876); 
					op = Operator.SUBTRACT;
					}
					break;
				case 3 :
					// Meta.g:991:7: T_ASTERISK
					{
					match(input,T_ASTERISK,FOLLOW_T_ASTERISK_in_getOperator6886); 
					op = Operator.MULTIPLICATION;
					}
					break;
				case 4 :
					// Meta.g:992:7: T_SLASH
					{
					match(input,T_SLASH,FOLLOW_T_SLASH_in_getOperator6896); 
					op = Operator.DIVISION;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return op;
	}
	// $ANTLR end "getOperator"



	// $ANTLR start "getComparator"
	// Meta.g:995:1: getComparator returns [Operator op] : ( T_EQUAL | T_GT | T_LT | T_GTE | T_LTE | T_NOT_EQUAL | T_LIKE | T_MATCH );
	public final Operator getComparator() throws RecognitionException {
		Operator op = null;


		try {
			// Meta.g:995:36: ( T_EQUAL | T_GT | T_LT | T_GTE | T_LTE | T_NOT_EQUAL | T_LIKE | T_MATCH )
			int alt78=8;
			switch ( input.LA(1) ) {
			case T_EQUAL:
				{
				alt78=1;
				}
				break;
			case T_GT:
				{
				alt78=2;
				}
				break;
			case T_LT:
				{
				alt78=3;
				}
				break;
			case T_GTE:
				{
				alt78=4;
				}
				break;
			case T_LTE:
				{
				alt78=5;
				}
				break;
			case T_NOT_EQUAL:
				{
				alt78=6;
				}
				break;
			case T_LIKE:
				{
				alt78=7;
				}
				break;
			case T_MATCH:
				{
				alt78=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				throw nvae;
			}
			switch (alt78) {
				case 1 :
					// Meta.g:996:5: T_EQUAL
					{
					match(input,T_EQUAL,FOLLOW_T_EQUAL_in_getComparator6914); 
					op = Operator.EQ;
					}
					break;
				case 2 :
					// Meta.g:997:7: T_GT
					{
					match(input,T_GT,FOLLOW_T_GT_in_getComparator6924); 
					op = Operator.GT;
					}
					break;
				case 3 :
					// Meta.g:998:7: T_LT
					{
					match(input,T_LT,FOLLOW_T_LT_in_getComparator6934); 
					op = Operator.LT;
					}
					break;
				case 4 :
					// Meta.g:999:7: T_GTE
					{
					match(input,T_GTE,FOLLOW_T_GTE_in_getComparator6944); 
					op = Operator.GET;
					}
					break;
				case 5 :
					// Meta.g:1000:7: T_LTE
					{
					match(input,T_LTE,FOLLOW_T_LTE_in_getComparator6954); 
					op = Operator.LET;
					}
					break;
				case 6 :
					// Meta.g:1001:7: T_NOT_EQUAL
					{
					match(input,T_NOT_EQUAL,FOLLOW_T_NOT_EQUAL_in_getComparator6964); 
					op = Operator.DISTINCT;
					}
					break;
				case 7 :
					// Meta.g:1002:7: T_LIKE
					{
					match(input,T_LIKE,FOLLOW_T_LIKE_in_getComparator6974); 
					op = Operator.LIKE;
					}
					break;
				case 8 :
					// Meta.g:1003:7: T_MATCH
					{
					match(input,T_MATCH,FOLLOW_T_MATCH_in_getComparator6984); 
					op = Operator.MATCH;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return op;
	}
	// $ANTLR end "getComparator"



	// $ANTLR start "getIds"
	// Meta.g:1006:1: getIds returns [ArrayList<String> listStrs] : ident1= T_IDENT ( T_COMMA identN= T_IDENT )* ;
	public final ArrayList<String> getIds() throws RecognitionException {
		ArrayList<String> listStrs = null;


		Token ident1=null;
		Token identN=null;


		        listStrs = new ArrayList<>();
		    
		try {
			// Meta.g:1009:6: (ident1= T_IDENT ( T_COMMA identN= T_IDENT )* )
			// Meta.g:1010:5: ident1= T_IDENT ( T_COMMA identN= T_IDENT )*
			{
			ident1=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getIds7012); 
			listStrs.add((ident1!=null?ident1.getText():null));
			// Meta.g:1010:50: ( T_COMMA identN= T_IDENT )*
			loop79:
			while (true) {
				int alt79=2;
				int LA79_0 = input.LA(1);
				if ( (LA79_0==T_COMMA) ) {
					alt79=1;
				}

				switch (alt79) {
				case 1 :
					// Meta.g:1010:51: T_COMMA identN= T_IDENT
					{
					match(input,T_COMMA,FOLLOW_T_COMMA_in_getIds7017); 
					identN=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getIds7021); 
					listStrs.add((identN!=null?identN.getText():null));
					}
					break;

				default :
					break loop79;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return listStrs;
	}
	// $ANTLR end "getIds"



	// $ANTLR start "getOptions"
	// Meta.g:1013:1: getOptions[TableName tablename] returns [ArrayList<Option> opts] : opt1= getOption[tablename] (optN= getOption[tablename] )* ;
	public final ArrayList<Option> getOptions(TableName tablename) throws RecognitionException {
		ArrayList<Option> opts = null;


		Option opt1 =null;
		Option optN =null;


		        opts = new ArrayList<>();
		    
		try {
			// Meta.g:1015:6: (opt1= getOption[tablename] (optN= getOption[tablename] )* )
			// Meta.g:1016:5: opt1= getOption[tablename] (optN= getOption[tablename] )*
			{
			pushFollow(FOLLOW_getOption_in_getOptions7047);
			opt1=getOption(tablename);
			state._fsp--;

			opts.add(opt1);
			// Meta.g:1016:49: (optN= getOption[tablename] )*
			loop80:
			while (true) {
				int alt80=2;
				int LA80_0 = input.LA(1);
				if ( (LA80_0==QUOTED_LITERAL||LA80_0==T_AVG||LA80_0==T_BOOLEAN||LA80_0==T_CATALOG||LA80_0==T_CLUSTERING||LA80_0==T_COMPACT||(LA80_0 >= T_CONSTANT && LA80_0 <= T_COUNT)||LA80_0==T_CTLG_TBL_COL||(LA80_0 >= T_DAY && LA80_0 <= T_DAYS)||(LA80_0 >= T_FALSE && LA80_0 <= T_FLOAT)||(LA80_0 >= T_HOUR && LA80_0 <= T_IDENT)||LA80_0==T_INT||LA80_0==T_KEY||LA80_0==T_KS_AND_TN||LA80_0==T_LIMIT||(LA80_0 >= T_LUCENE && LA80_0 <= T_MAP)||(LA80_0 >= T_MAX && LA80_0 <= T_MINUTES)||LA80_0==T_OPTIONS||LA80_0==T_PLAN||LA80_0==T_PROCESS||(LA80_0 >= T_SEC && LA80_0 <= T_SECS)||LA80_0==T_STORAGE||LA80_0==T_SUM||LA80_0==T_TEXT||LA80_0==T_TRUE||LA80_0==T_TYPE) ) {
					alt80=1;
				}

				switch (alt80) {
				case 1 :
					// Meta.g:1016:50: optN= getOption[tablename]
					{
					pushFollow(FOLLOW_getOption_in_getOptions7055);
					optN=getOption(tablename);
					state._fsp--;

					opts.add(optN);
					}
					break;

				default :
					break loop80;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return opts;
	}
	// $ANTLR end "getOptions"



	// $ANTLR start "getOption"
	// Meta.g:1019:1: getOption[TableName tablename] returns [Option opt] : ( T_COMPACT T_STORAGE | T_CLUSTERING T_ORDER |identProp= getSelector[tablename] T_EQUAL valueProp= getSelector[tablename] );
	public final Option getOption(TableName tablename) throws RecognitionException {
		Option opt = null;


		Selector identProp =null;
		Selector valueProp =null;

		try {
			// Meta.g:1019:52: ( T_COMPACT T_STORAGE | T_CLUSTERING T_ORDER |identProp= getSelector[tablename] T_EQUAL valueProp= getSelector[tablename] )
			int alt81=3;
			switch ( input.LA(1) ) {
			case T_COMPACT:
				{
				alt81=1;
				}
				break;
			case T_CLUSTERING:
				{
				alt81=2;
				}
				break;
			case QUOTED_LITERAL:
			case T_AVG:
			case T_BOOLEAN:
			case T_CATALOG:
			case T_CONSTANT:
			case T_COUNT:
			case T_CTLG_TBL_COL:
			case T_DAY:
			case T_DAYS:
			case T_FALSE:
			case T_FLOAT:
			case T_HOUR:
			case T_HOURS:
			case T_IDENT:
			case T_INT:
			case T_KEY:
			case T_KS_AND_TN:
			case T_LIMIT:
			case T_LUCENE:
			case T_MAP:
			case T_MAX:
			case T_MIN:
			case T_MINS:
			case T_MINUTE:
			case T_MINUTES:
			case T_OPTIONS:
			case T_PLAN:
			case T_PROCESS:
			case T_SEC:
			case T_SECOND:
			case T_SECONDS:
			case T_SECS:
			case T_STORAGE:
			case T_SUM:
			case T_TEXT:
			case T_TRUE:
			case T_TYPE:
				{
				alt81=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}
			switch (alt81) {
				case 1 :
					// Meta.g:1020:5: T_COMPACT T_STORAGE
					{
					match(input,T_COMPACT,FOLLOW_T_COMPACT_in_getOption7077); 
					match(input,T_STORAGE,FOLLOW_T_STORAGE_in_getOption7079); 
					opt =new Option(Option.OPTION_COMPACT);
					}
					break;
				case 2 :
					// Meta.g:1021:7: T_CLUSTERING T_ORDER
					{
					match(input,T_CLUSTERING,FOLLOW_T_CLUSTERING_in_getOption7089); 
					match(input,T_ORDER,FOLLOW_T_ORDER_in_getOption7091); 
					opt =new Option(Option.OPTION_CLUSTERING);
					}
					break;
				case 3 :
					// Meta.g:1022:7: identProp= getSelector[tablename] T_EQUAL valueProp= getSelector[tablename]
					{
					pushFollow(FOLLOW_getSelector_in_getOption7103);
					identProp=getSelector(tablename);
					state._fsp--;

					match(input,T_EQUAL,FOLLOW_T_EQUAL_in_getOption7106); 
					pushFollow(FOLLOW_getSelector_in_getOption7110);
					valueProp=getSelector(tablename);
					state._fsp--;

					opt =new Option(identProp, valueProp);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return opt;
	}
	// $ANTLR end "getOption"



	// $ANTLR start "getSelectors"
	// Meta.g:1025:1: getSelectors[TableName tablename] returns [ArrayList list] : term1= getSelector[tablename] ( T_COMMA termN= getSelector[tablename] )* ;
	public final ArrayList getSelectors(TableName tablename) throws RecognitionException {
		ArrayList list = null;


		Selector term1 =null;
		Selector termN =null;


		        list = new ArrayList<Selector>();
		    
		try {
			// Meta.g:1028:6: (term1= getSelector[tablename] ( T_COMMA termN= getSelector[tablename] )* )
			// Meta.g:1029:5: term1= getSelector[tablename] ( T_COMMA termN= getSelector[tablename] )*
			{
			pushFollow(FOLLOW_getSelector_in_getSelectors7140);
			term1=getSelector(tablename);
			state._fsp--;

			list.add(term1);
			// Meta.g:1030:5: ( T_COMMA termN= getSelector[tablename] )*
			loop82:
			while (true) {
				int alt82=2;
				int LA82_0 = input.LA(1);
				if ( (LA82_0==T_COMMA) ) {
					alt82=1;
				}

				switch (alt82) {
				case 1 :
					// Meta.g:1030:6: T_COMMA termN= getSelector[tablename]
					{
					match(input,T_COMMA,FOLLOW_T_COMMA_in_getSelectors7150); 
					pushFollow(FOLLOW_getSelector_in_getSelectors7154);
					termN=getSelector(tablename);
					state._fsp--;

					list.add(termN);
					}
					break;

				default :
					break loop82;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return list;
	}
	// $ANTLR end "getSelectors"



	// $ANTLR start "getAliasedTableID"
	// Meta.g:1033:1: getAliasedTableID[Map tablesAliasesMap] returns [TableName result] : tableN= getTableName ( T_AS alias= T_IDENT )? ;
	public final TableName getAliasedTableID(Map tablesAliasesMap) throws RecognitionException {
		TableName result = null;


		Token alias=null;
		TableName tableN =null;

		try {
			// Meta.g:1033:67: (tableN= getTableName ( T_AS alias= T_IDENT )? )
			// Meta.g:1034:2: tableN= getTableName ( T_AS alias= T_IDENT )?
			{
			pushFollow(FOLLOW_getTableName_in_getAliasedTableID7175);
			tableN=getTableName();
			state._fsp--;

			// Meta.g:1034:22: ( T_AS alias= T_IDENT )?
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==T_AS) ) {
				alt83=1;
			}
			switch (alt83) {
				case 1 :
					// Meta.g:1034:23: T_AS alias= T_IDENT
					{
					match(input,T_AS,FOLLOW_T_AS_in_getAliasedTableID7178); 
					alias=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getAliasedTableID7182); 
					tablesAliasesMap.put((alias!=null?alias.getText():null), tableN.toString()); tableN.setAlias((alias!=null?alias.getText():null)); 
					}
					break;

			}

			result = tableN;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "getAliasedTableID"



	// $ANTLR start "getColumnName"
	// Meta.g:1038:1: getColumnName[TableName tablename] returns [ColumnName columnName] : (ident1= T_IDENT |ident2= T_KS_AND_TN |ident3= T_CTLG_TBL_COL |allowedReservedWord= getAllowedReservedWord ) ;
	public final ColumnName getColumnName(TableName tablename) throws RecognitionException {
		ColumnName columnName = null;


		Token ident1=null;
		Token ident2=null;
		Token ident3=null;
		String allowedReservedWord =null;

		try {
			// Meta.g:1038:67: ( (ident1= T_IDENT |ident2= T_KS_AND_TN |ident3= T_CTLG_TBL_COL |allowedReservedWord= getAllowedReservedWord ) )
			// Meta.g:1039:5: (ident1= T_IDENT |ident2= T_KS_AND_TN |ident3= T_CTLG_TBL_COL |allowedReservedWord= getAllowedReservedWord )
			{
			// Meta.g:1039:5: (ident1= T_IDENT |ident2= T_KS_AND_TN |ident3= T_CTLG_TBL_COL |allowedReservedWord= getAllowedReservedWord )
			int alt84=4;
			switch ( input.LA(1) ) {
			case T_IDENT:
				{
				alt84=1;
				}
				break;
			case T_KS_AND_TN:
				{
				alt84=2;
				}
				break;
			case T_CTLG_TBL_COL:
				{
				alt84=3;
				}
				break;
			case T_BOOLEAN:
			case T_CATALOG:
			case T_COUNT:
			case T_DAY:
			case T_DAYS:
			case T_HOUR:
			case T_HOURS:
			case T_INT:
			case T_KEY:
			case T_LIMIT:
			case T_LUCENE:
			case T_MAP:
			case T_MINS:
			case T_MINUTE:
			case T_MINUTES:
			case T_OPTIONS:
			case T_PLAN:
			case T_PROCESS:
			case T_SEC:
			case T_SECOND:
			case T_SECONDS:
			case T_SECS:
			case T_STORAGE:
			case T_TEXT:
			case T_TYPE:
				{
				alt84=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 84, 0, input);
				throw nvae;
			}
			switch (alt84) {
				case 1 :
					// Meta.g:1039:7: ident1= T_IDENT
					{
					ident1=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getColumnName7210); 
					columnName = normalizeColumnName(tablename, (ident1!=null?ident1.getText():null));
					}
					break;
				case 2 :
					// Meta.g:1040:7: ident2= T_KS_AND_TN
					{
					ident2=(Token)match(input,T_KS_AND_TN,FOLLOW_T_KS_AND_TN_in_getColumnName7222); 
					columnName = normalizeColumnName(tablename, (ident2!=null?ident2.getText():null));
					}
					break;
				case 3 :
					// Meta.g:1041:7: ident3= T_CTLG_TBL_COL
					{
					ident3=(Token)match(input,T_CTLG_TBL_COL,FOLLOW_T_CTLG_TBL_COL_in_getColumnName7234); 
					columnName = normalizeColumnName(tablename, (ident3!=null?ident3.getText():null));
					}
					break;
				case 4 :
					// Meta.g:1042:7: allowedReservedWord= getAllowedReservedWord
					{
					pushFollow(FOLLOW_getAllowedReservedWord_in_getColumnName7246);
					allowedReservedWord=getAllowedReservedWord();
					state._fsp--;

					columnName = normalizeColumnName(tablename, allowedReservedWord);
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return columnName;
	}
	// $ANTLR end "getColumnName"



	// $ANTLR start "getIndexName"
	// Meta.g:1045:1: getIndexName returns [IndexName indexName] : ident= ( T_KS_AND_TN | T_CTLG_TBL_COL ) ;
	public final IndexName getIndexName() throws RecognitionException {
		IndexName indexName = null;


		Token ident=null;

		try {
			// Meta.g:1045:43: (ident= ( T_KS_AND_TN | T_CTLG_TBL_COL ) )
			// Meta.g:1046:5: ident= ( T_KS_AND_TN | T_CTLG_TBL_COL )
			{
			ident=input.LT(1);
			if ( input.LA(1)==T_CTLG_TBL_COL||input.LA(1)==T_KS_AND_TN ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			 indexName = normalizeIndexName((ident!=null?ident.getText():null)); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return indexName;
	}
	// $ANTLR end "getIndexName"



	// $ANTLR start "getAllowedReservedWord"
	// Meta.g:1051:1: getAllowedReservedWord returns [String str] : ident= ( T_SEC | T_SECS | T_SECOND | T_SECONDS | T_MINS | T_MINUTE | T_MINUTES | T_HOUR | T_HOURS | T_DAY | T_DAYS | T_COUNT | T_PLAN | T_TYPE | T_LIMIT | T_PROCESS | T_STORAGE | T_OPTIONS | T_CATALOG | T_MAP | T_INT | T_BOOLEAN | T_TEXT | T_LUCENE | T_KEY ) ;
	public final String getAllowedReservedWord() throws RecognitionException {
		String str = null;


		Token ident=null;

		try {
			// Meta.g:1051:44: (ident= ( T_SEC | T_SECS | T_SECOND | T_SECONDS | T_MINS | T_MINUTE | T_MINUTES | T_HOUR | T_HOURS | T_DAY | T_DAYS | T_COUNT | T_PLAN | T_TYPE | T_LIMIT | T_PROCESS | T_STORAGE | T_OPTIONS | T_CATALOG | T_MAP | T_INT | T_BOOLEAN | T_TEXT | T_LUCENE | T_KEY ) )
			// Meta.g:1052:5: ident= ( T_SEC | T_SECS | T_SECOND | T_SECONDS | T_MINS | T_MINUTE | T_MINUTES | T_HOUR | T_HOURS | T_DAY | T_DAYS | T_COUNT | T_PLAN | T_TYPE | T_LIMIT | T_PROCESS | T_STORAGE | T_OPTIONS | T_CATALOG | T_MAP | T_INT | T_BOOLEAN | T_TEXT | T_LUCENE | T_KEY )
			{
			ident=input.LT(1);
			if ( input.LA(1)==T_BOOLEAN||input.LA(1)==T_CATALOG||input.LA(1)==T_COUNT||(input.LA(1) >= T_DAY && input.LA(1) <= T_DAYS)||(input.LA(1) >= T_HOUR && input.LA(1) <= T_HOURS)||input.LA(1)==T_INT||input.LA(1)==T_KEY||input.LA(1)==T_LIMIT||(input.LA(1) >= T_LUCENE && input.LA(1) <= T_MAP)||(input.LA(1) >= T_MINS && input.LA(1) <= T_MINUTES)||input.LA(1)==T_OPTIONS||input.LA(1)==T_PLAN||input.LA(1)==T_PROCESS||(input.LA(1) >= T_SEC && input.LA(1) <= T_SECS)||input.LA(1)==T_STORAGE||input.LA(1)==T_TEXT||input.LA(1)==T_TYPE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			 str = new String((ident!=null?ident.getText():null)); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "getAllowedReservedWord"



	// $ANTLR start "getGenericID"
	// Meta.g:1080:1: getGenericID returns [String str] : (arw= getAllowedReservedWord |ident= T_IDENT );
	public final String getGenericID() throws RecognitionException {
		String str = null;


		Token ident=null;
		String arw =null;

		try {
			// Meta.g:1080:34: (arw= getAllowedReservedWord |ident= T_IDENT )
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==T_BOOLEAN||LA85_0==T_CATALOG||LA85_0==T_COUNT||(LA85_0 >= T_DAY && LA85_0 <= T_DAYS)||(LA85_0 >= T_HOUR && LA85_0 <= T_HOURS)||LA85_0==T_INT||LA85_0==T_KEY||LA85_0==T_LIMIT||(LA85_0 >= T_LUCENE && LA85_0 <= T_MAP)||(LA85_0 >= T_MINS && LA85_0 <= T_MINUTES)||LA85_0==T_OPTIONS||LA85_0==T_PLAN||LA85_0==T_PROCESS||(LA85_0 >= T_SEC && LA85_0 <= T_SECS)||LA85_0==T_STORAGE||LA85_0==T_TEXT||LA85_0==T_TYPE) ) {
				alt85=1;
			}
			else if ( (LA85_0==T_IDENT) ) {
				alt85=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 85, 0, input);
				throw nvae;
			}

			switch (alt85) {
				case 1 :
					// Meta.g:1081:5: arw= getAllowedReservedWord
					{
					pushFollow(FOLLOW_getAllowedReservedWord_in_getGenericID7532);
					arw=getAllowedReservedWord();
					state._fsp--;

					 str = arw; 
					}
					break;
				case 2 :
					// Meta.g:1082:7: ident= T_IDENT
					{
					ident=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getGenericID7544); 
					 str = (ident!=null?ident.getText():null); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "getGenericID"



	// $ANTLR start "getTableName"
	// Meta.g:1085:1: getTableName returns [TableName tablename] : (ident1= getGenericID |ident2= T_KS_AND_TN ) ;
	public final TableName getTableName() throws RecognitionException {
		TableName tablename = null;


		Token ident2=null;
		String ident1 =null;

		try {
			// Meta.g:1085:43: ( (ident1= getGenericID |ident2= T_KS_AND_TN ) )
			// Meta.g:1086:5: (ident1= getGenericID |ident2= T_KS_AND_TN )
			{
			// Meta.g:1086:5: (ident1= getGenericID |ident2= T_KS_AND_TN )
			int alt86=2;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==T_BOOLEAN||LA86_0==T_CATALOG||LA86_0==T_COUNT||(LA86_0 >= T_DAY && LA86_0 <= T_DAYS)||(LA86_0 >= T_HOUR && LA86_0 <= T_IDENT)||LA86_0==T_INT||LA86_0==T_KEY||LA86_0==T_LIMIT||(LA86_0 >= T_LUCENE && LA86_0 <= T_MAP)||(LA86_0 >= T_MINS && LA86_0 <= T_MINUTES)||LA86_0==T_OPTIONS||LA86_0==T_PLAN||LA86_0==T_PROCESS||(LA86_0 >= T_SEC && LA86_0 <= T_SECS)||LA86_0==T_STORAGE||LA86_0==T_TEXT||LA86_0==T_TYPE) ) {
				alt86=1;
			}
			else if ( (LA86_0==T_KS_AND_TN) ) {
				alt86=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 86, 0, input);
				throw nvae;
			}

			switch (alt86) {
				case 1 :
					// Meta.g:1086:6: ident1= getGenericID
					{
					pushFollow(FOLLOW_getGenericID_in_getTableName7565);
					ident1=getGenericID();
					state._fsp--;

					tablename = normalizeTableName(ident1);
					}
					break;
				case 2 :
					// Meta.g:1087:7: ident2= T_KS_AND_TN
					{
					ident2=(Token)match(input,T_KS_AND_TN,FOLLOW_T_KS_AND_TN_in_getTableName7577); 
					tablename = normalizeTableName((ident2!=null?ident2.getText():null));
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return tablename;
	}
	// $ANTLR end "getTableName"



	// $ANTLR start "getFloat"
	// Meta.g:1095:1: getFloat returns [String floating] : (termToken= T_TERM |floatToken= T_FLOAT );
	public final String getFloat() throws RecognitionException {
		String floating = null;


		Token termToken=null;
		Token floatToken=null;

		try {
			// Meta.g:1095:35: (termToken= T_TERM |floatToken= T_FLOAT )
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==T_TERM) ) {
				alt87=1;
			}
			else if ( (LA87_0==T_FLOAT) ) {
				alt87=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 87, 0, input);
				throw nvae;
			}

			switch (alt87) {
				case 1 :
					// Meta.g:1096:5: termToken= T_TERM
					{
					termToken=(Token)match(input,T_TERM,FOLLOW_T_TERM_in_getFloat7601); 
					floating =(termToken!=null?termToken.getText():null);
					}
					break;
				case 2 :
					// Meta.g:1097:7: floatToken= T_FLOAT
					{
					floatToken=(Token)match(input,T_FLOAT,FOLLOW_T_FLOAT_in_getFloat7615); 
					floating =(floatToken!=null?floatToken.getText():null);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return floating;
	}
	// $ANTLR end "getFloat"



	// $ANTLR start "getJson"
	// Meta.g:1100:1: getJson returns [String strJson] : (objectJson= getObjectJson |arrayJson= getArrayJson ) ;
	public final String getJson() throws RecognitionException {
		String strJson = null;


		String objectJson =null;
		String arrayJson =null;

		try {
			// Meta.g:1100:33: ( (objectJson= getObjectJson |arrayJson= getArrayJson ) )
			// Meta.g:1101:5: (objectJson= getObjectJson |arrayJson= getArrayJson )
			{
			// Meta.g:1101:5: (objectJson= getObjectJson |arrayJson= getArrayJson )
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==T_START_SBRACKET) ) {
				alt88=1;
			}
			else if ( (LA88_0==T_START_BRACKET) ) {
				alt88=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 88, 0, input);
				throw nvae;
			}

			switch (alt88) {
				case 1 :
					// Meta.g:1101:6: objectJson= getObjectJson
					{
					pushFollow(FOLLOW_getObjectJson_in_getJson7636);
					objectJson=getObjectJson();
					state._fsp--;

					strJson=objectJson;
					}
					break;
				case 2 :
					// Meta.g:1102:7: arrayJson= getArrayJson
					{
					pushFollow(FOLLOW_getArrayJson_in_getJson7648);
					arrayJson=getArrayJson();
					state._fsp--;

					strJson=arrayJson;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return strJson;
	}
	// $ANTLR end "getJson"



	// $ANTLR start "getObjectJson"
	// Meta.g:1105:1: getObjectJson returns [String strJson] : ( T_START_SBRACKET pairJson= getPairJson ( T_COMMA pairJsonN= getPairJson )* T_END_SBRACKET | T_START_SBRACKET T_END_SBRACKET ) ;
	public final String getObjectJson() throws RecognitionException {
		String strJson = null;


		String pairJson =null;
		String pairJsonN =null;


		        StringBuilder sb = new StringBuilder();
		    
		try {
			// Meta.g:1111:6: ( ( T_START_SBRACKET pairJson= getPairJson ( T_COMMA pairJsonN= getPairJson )* T_END_SBRACKET | T_START_SBRACKET T_END_SBRACKET ) )
			// Meta.g:1112:5: ( T_START_SBRACKET pairJson= getPairJson ( T_COMMA pairJsonN= getPairJson )* T_END_SBRACKET | T_START_SBRACKET T_END_SBRACKET )
			{
			// Meta.g:1112:5: ( T_START_SBRACKET pairJson= getPairJson ( T_COMMA pairJsonN= getPairJson )* T_END_SBRACKET | T_START_SBRACKET T_END_SBRACKET )
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==T_START_SBRACKET) ) {
				int LA90_1 = input.LA(2);
				if ( (LA90_1==QUOTED_LITERAL||LA90_1==T_AVG||LA90_1==T_BOOLEAN||LA90_1==T_CATALOG||(LA90_1 >= T_CONSTANT && LA90_1 <= T_COUNT)||LA90_1==T_CTLG_TBL_COL||(LA90_1 >= T_DAY && LA90_1 <= T_DAYS)||(LA90_1 >= T_FALSE && LA90_1 <= T_FLOAT)||(LA90_1 >= T_HOUR && LA90_1 <= T_IDENT)||LA90_1==T_INT||LA90_1==T_KEY||LA90_1==T_KS_AND_TN||LA90_1==T_LIMIT||(LA90_1 >= T_LUCENE && LA90_1 <= T_MAP)||(LA90_1 >= T_MAX && LA90_1 <= T_MINUTES)||LA90_1==T_OPTIONS||LA90_1==T_PLAN||LA90_1==T_PROCESS||(LA90_1 >= T_SEC && LA90_1 <= T_SECS)||LA90_1==T_STORAGE||LA90_1==T_SUM||LA90_1==T_TEXT||LA90_1==T_TRUE||LA90_1==T_TYPE) ) {
					alt90=1;
				}
				else if ( (LA90_1==T_END_SBRACKET) ) {
					alt90=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 90, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 90, 0, input);
				throw nvae;
			}

			switch (alt90) {
				case 1 :
					// Meta.g:1112:6: T_START_SBRACKET pairJson= getPairJson ( T_COMMA pairJsonN= getPairJson )* T_END_SBRACKET
					{
					match(input,T_START_SBRACKET,FOLLOW_T_START_SBRACKET_in_getObjectJson7684); 
					sb.append("{");
					pushFollow(FOLLOW_getPairJson_in_getObjectJson7690);
					pairJson=getPairJson();
					state._fsp--;

					sb.append(pairJson);
					// Meta.g:1112:85: ( T_COMMA pairJsonN= getPairJson )*
					loop89:
					while (true) {
						int alt89=2;
						int LA89_0 = input.LA(1);
						if ( (LA89_0==T_COMMA) ) {
							alt89=1;
						}

						switch (alt89) {
						case 1 :
							// Meta.g:1112:86: T_COMMA pairJsonN= getPairJson
							{
							match(input,T_COMMA,FOLLOW_T_COMMA_in_getObjectJson7695); 
							sb.append(", ");
							pushFollow(FOLLOW_getPairJson_in_getObjectJson7701);
							pairJsonN=getPairJson();
							state._fsp--;

							sb.append(pairJsonN);
							}
							break;

						default :
							break loop89;
						}
					}

					match(input,T_END_SBRACKET,FOLLOW_T_END_SBRACKET_in_getObjectJson7707); 
					sb.append("}");
					}
					break;
				case 2 :
					// Meta.g:1113:7: T_START_SBRACKET T_END_SBRACKET
					{
					match(input,T_START_SBRACKET,FOLLOW_T_START_SBRACKET_in_getObjectJson7717); 
					sb.append("{");
					match(input,T_END_SBRACKET,FOLLOW_T_END_SBRACKET_in_getObjectJson7721); 
					sb.append("}");
					}
					break;

			}

			}


			        strJson = sb.toString();
			    
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return strJson;
	}
	// $ANTLR end "getObjectJson"



	// $ANTLR start "getPairJson"
	// Meta.g:1116:1: getPairJson returns [String strJson] : keyTerm= getSelector[null] T_COLON valueJson= getValueJson ;
	public final String getPairJson() throws RecognitionException {
		String strJson = null;


		Selector keyTerm =null;
		String valueJson =null;


		        StringBuilder sb = new StringBuilder();
		    
		try {
			// Meta.g:1122:6: (keyTerm= getSelector[null] T_COLON valueJson= getValueJson )
			// Meta.g:1123:5: keyTerm= getSelector[null] T_COLON valueJson= getValueJson
			{
			pushFollow(FOLLOW_getSelector_in_getPairJson7758);
			keyTerm=getSelector(null);
			state._fsp--;

			sb.append(keyTerm.toString());
			match(input,T_COLON,FOLLOW_T_COLON_in_getPairJson7767); 
			sb.append(": ");
			pushFollow(FOLLOW_getValueJson_in_getPairJson7777);
			valueJson=getValueJson();
			state._fsp--;

			sb.append(valueJson);
			}


			        strJson = sb.toString();
			    
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return strJson;
	}
	// $ANTLR end "getPairJson"



	// $ANTLR start "getArrayJson"
	// Meta.g:1128:1: getArrayJson returns [String strJson] : ( T_START_BRACKET valueJson= getValueJson ( T_COMMA valueJsonN= getValueJson )* T_END_BRACKET | T_START_BRACKET T_END_BRACKET ) ;
	public final String getArrayJson() throws RecognitionException {
		String strJson = null;


		String valueJson =null;
		String valueJsonN =null;


		        StringBuilder sb = new StringBuilder();
		    
		try {
			// Meta.g:1134:6: ( ( T_START_BRACKET valueJson= getValueJson ( T_COMMA valueJsonN= getValueJson )* T_END_BRACKET | T_START_BRACKET T_END_BRACKET ) )
			// Meta.g:1135:5: ( T_START_BRACKET valueJson= getValueJson ( T_COMMA valueJsonN= getValueJson )* T_END_BRACKET | T_START_BRACKET T_END_BRACKET )
			{
			// Meta.g:1135:5: ( T_START_BRACKET valueJson= getValueJson ( T_COMMA valueJsonN= getValueJson )* T_END_BRACKET | T_START_BRACKET T_END_BRACKET )
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==T_START_BRACKET) ) {
				int LA92_1 = input.LA(2);
				if ( (LA92_1==QUOTED_LITERAL||LA92_1==T_AVG||LA92_1==T_BOOLEAN||LA92_1==T_CATALOG||(LA92_1 >= T_CONSTANT && LA92_1 <= T_COUNT)||LA92_1==T_CTLG_TBL_COL||(LA92_1 >= T_DAY && LA92_1 <= T_DAYS)||(LA92_1 >= T_FALSE && LA92_1 <= T_FLOAT)||(LA92_1 >= T_HOUR && LA92_1 <= T_IDENT)||LA92_1==T_INT||LA92_1==T_KEY||LA92_1==T_KS_AND_TN||LA92_1==T_LIMIT||(LA92_1 >= T_LUCENE && LA92_1 <= T_MAP)||(LA92_1 >= T_MAX && LA92_1 <= T_MINUTES)||LA92_1==T_OPTIONS||LA92_1==T_PLAN||LA92_1==T_PROCESS||(LA92_1 >= T_SEC && LA92_1 <= T_SECS)||LA92_1==T_START_BRACKET||LA92_1==T_START_SBRACKET||LA92_1==T_STORAGE||LA92_1==T_SUM||LA92_1==T_TEXT||LA92_1==T_TRUE||LA92_1==T_TYPE) ) {
					alt92=1;
				}
				else if ( (LA92_1==T_END_BRACKET) ) {
					alt92=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 92, 0, input);
				throw nvae;
			}

			switch (alt92) {
				case 1 :
					// Meta.g:1135:6: T_START_BRACKET valueJson= getValueJson ( T_COMMA valueJsonN= getValueJson )* T_END_BRACKET
					{
					match(input,T_START_BRACKET,FOLLOW_T_START_BRACKET_in_getArrayJson7812); 
					sb.append("[");
					pushFollow(FOLLOW_getValueJson_in_getArrayJson7818);
					valueJson=getValueJson();
					state._fsp--;

					sb.append(valueJson);
					// Meta.g:1136:9: ( T_COMMA valueJsonN= getValueJson )*
					loop91:
					while (true) {
						int alt91=2;
						int LA91_0 = input.LA(1);
						if ( (LA91_0==T_COMMA) ) {
							alt91=1;
						}

						switch (alt91) {
						case 1 :
							// Meta.g:1136:10: T_COMMA valueJsonN= getValueJson
							{
							match(input,T_COMMA,FOLLOW_T_COMMA_in_getArrayJson7831); 
							sb.append(", ");
							pushFollow(FOLLOW_getValueJson_in_getArrayJson7837);
							valueJsonN=getValueJson();
							state._fsp--;

							sb.append(valueJsonN);
							}
							break;

						default :
							break loop91;
						}
					}

					match(input,T_END_BRACKET,FOLLOW_T_END_BRACKET_in_getArrayJson7843); 
					sb.append("]");
					}
					break;
				case 2 :
					// Meta.g:1137:7: T_START_BRACKET T_END_BRACKET
					{
					match(input,T_START_BRACKET,FOLLOW_T_START_BRACKET_in_getArrayJson7853); 
					sb.append("[");
					match(input,T_END_BRACKET,FOLLOW_T_END_BRACKET_in_getArrayJson7857); 
					sb.append("]");
					}
					break;

			}

			}


			        strJson = sb.toString();
			    
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return strJson;
	}
	// $ANTLR end "getArrayJson"



	// $ANTLR start "getValueJson"
	// Meta.g:1140:1: getValueJson returns [String strJson] : (tokenTerm= getSelector[null] |objectJson= getObjectJson |arrayJson= getArrayJson ) ;
	public final String getValueJson() throws RecognitionException {
		String strJson = null;


		Selector tokenTerm =null;
		String objectJson =null;
		String arrayJson =null;


		        StringBuilder sb = new StringBuilder();
		    
		try {
			// Meta.g:1146:6: ( (tokenTerm= getSelector[null] |objectJson= getObjectJson |arrayJson= getArrayJson ) )
			// Meta.g:1147:5: (tokenTerm= getSelector[null] |objectJson= getObjectJson |arrayJson= getArrayJson )
			{
			// Meta.g:1147:5: (tokenTerm= getSelector[null] |objectJson= getObjectJson |arrayJson= getArrayJson )
			int alt93=3;
			switch ( input.LA(1) ) {
			case QUOTED_LITERAL:
			case T_AVG:
			case T_BOOLEAN:
			case T_CATALOG:
			case T_CONSTANT:
			case T_COUNT:
			case T_CTLG_TBL_COL:
			case T_DAY:
			case T_DAYS:
			case T_FALSE:
			case T_FLOAT:
			case T_HOUR:
			case T_HOURS:
			case T_IDENT:
			case T_INT:
			case T_KEY:
			case T_KS_AND_TN:
			case T_LIMIT:
			case T_LUCENE:
			case T_MAP:
			case T_MAX:
			case T_MIN:
			case T_MINS:
			case T_MINUTE:
			case T_MINUTES:
			case T_OPTIONS:
			case T_PLAN:
			case T_PROCESS:
			case T_SEC:
			case T_SECOND:
			case T_SECONDS:
			case T_SECS:
			case T_STORAGE:
			case T_SUM:
			case T_TEXT:
			case T_TRUE:
			case T_TYPE:
				{
				alt93=1;
				}
				break;
			case T_START_SBRACKET:
				{
				alt93=2;
				}
				break;
			case T_START_BRACKET:
				{
				alt93=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 93, 0, input);
				throw nvae;
			}
			switch (alt93) {
				case 1 :
					// Meta.g:1147:6: tokenTerm= getSelector[null]
					{
					pushFollow(FOLLOW_getSelector_in_getValueJson7895);
					tokenTerm=getSelector(null);
					state._fsp--;

					sb.append(tokenTerm.toString());
					}
					break;
				case 2 :
					// Meta.g:1148:7: objectJson= getObjectJson
					{
					pushFollow(FOLLOW_getObjectJson_in_getValueJson7908);
					objectJson=getObjectJson();
					state._fsp--;

					sb.append(objectJson);
					}
					break;
				case 3 :
					// Meta.g:1149:7: arrayJson= getArrayJson
					{
					pushFollow(FOLLOW_getArrayJson_in_getValueJson7920);
					arrayJson=getArrayJson();
					state._fsp--;

					sb.append(arrayJson);
					}
					break;

			}

			}


			        strJson = sb.toString();
			    
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return strJson;
	}
	// $ANTLR end "getValueJson"



	// $ANTLR start "getColumn"
	// Meta.g:1152:1: getColumn returns [ColumnName column] : (ident1= T_IDENT |ident2= T_KS_AND_TN |ident3= T_CTLG_TBL_COL ) ;
	public final ColumnName getColumn() throws RecognitionException {
		ColumnName column = null;


		Token ident1=null;
		Token ident2=null;
		Token ident3=null;


		       String t1 = null;
		       String t2 = null;
		       String t3 = null;
		    
		try {
			// Meta.g:1173:6: ( (ident1= T_IDENT |ident2= T_KS_AND_TN |ident3= T_CTLG_TBL_COL ) )
			// Meta.g:1174:5: (ident1= T_IDENT |ident2= T_KS_AND_TN |ident3= T_CTLG_TBL_COL )
			{
			// Meta.g:1174:5: (ident1= T_IDENT |ident2= T_KS_AND_TN |ident3= T_CTLG_TBL_COL )
			int alt94=3;
			switch ( input.LA(1) ) {
			case T_IDENT:
				{
				alt94=1;
				}
				break;
			case T_KS_AND_TN:
				{
				alt94=2;
				}
				break;
			case T_CTLG_TBL_COL:
				{
				alt94=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 94, 0, input);
				throw nvae;
			}
			switch (alt94) {
				case 1 :
					// Meta.g:1174:6: ident1= T_IDENT
					{
					ident1=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getColumn7958); 
					t1 = (ident1!=null?ident1.getText():null);
					}
					break;
				case 2 :
					// Meta.g:1175:7: ident2= T_KS_AND_TN
					{
					ident2=(Token)match(input,T_KS_AND_TN,FOLLOW_T_KS_AND_TN_in_getColumn7970); 
					t2 = (ident2!=null?ident2.getText():null);
					}
					break;
				case 3 :
					// Meta.g:1176:7: ident3= T_CTLG_TBL_COL
					{
					ident3=(Token)match(input,T_CTLG_TBL_COL,FOLLOW_T_CTLG_TBL_COL_in_getColumn7982); 
					t3 = (ident3!=null?ident3.getText():null);
					}
					break;

			}

			}


			        String columnName = t1;
			        if(t2 != null){
			            columnName = t2;
			        }else if(t3 != null){
			            columnName = t3;
			        }
			        String [] columnTokens = columnName.split("\\.");
			        if(columnTokens.length == 1){
			            column = new ColumnName(null, null, columnTokens[0]);
			        }else if(columnTokens.length == 2){
			            column = new ColumnName(null, columnTokens[0], columnTokens[1]);
			        }else{
			            column = new ColumnName(columnTokens[0], columnTokens[1], columnTokens[2]);
			        }
			    
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return column;
	}
	// $ANTLR end "getColumn"



	// $ANTLR start "getTable"
	// Meta.g:1179:1: getTable returns [TableName table] : (ident1= T_IDENT |ident2= T_KS_AND_TN ) ;
	public final TableName getTable() throws RecognitionException {
		TableName table = null;


		Token ident1=null;
		Token ident2=null;


		       String t1 = null;
		       String t2 = null;
		    
		try {
			// Meta.g:1197:6: ( (ident1= T_IDENT |ident2= T_KS_AND_TN ) )
			// Meta.g:1198:5: (ident1= T_IDENT |ident2= T_KS_AND_TN )
			{
			// Meta.g:1198:5: (ident1= T_IDENT |ident2= T_KS_AND_TN )
			int alt95=2;
			int LA95_0 = input.LA(1);
			if ( (LA95_0==T_IDENT) ) {
				alt95=1;
			}
			else if ( (LA95_0==T_KS_AND_TN) ) {
				alt95=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 95, 0, input);
				throw nvae;
			}

			switch (alt95) {
				case 1 :
					// Meta.g:1198:6: ident1= T_IDENT
					{
					ident1=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getTable8020); 
					t1 = (ident1!=null?ident1.getText():null);
					}
					break;
				case 2 :
					// Meta.g:1199:7: ident2= T_KS_AND_TN
					{
					ident2=(Token)match(input,T_KS_AND_TN,FOLLOW_T_KS_AND_TN_in_getTable8032); 
					t2 = (ident2!=null?ident2.getText():null);
					}
					break;

			}

			}


			        String tableName = t1;
			        if(t2 != null){
			            tableName = t2;
			        }

			        String [] tableTokens = tableName.split("\\.");
			        if(tableTokens.length == 2){
			         table = new TableName(tableTokens[0], tableTokens[1]);
			        }else{
			         table = new TableName(null, tableName);
			        }

			    
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return table;
	}
	// $ANTLR end "getTable"

	// Delegated rules



	public static final BitSet FOLLOW_T_ATTACH_in_attachClusterStatement2606 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_T_CLUSTER_in_attachClusterStatement2608 = new BitSet(new long[]{0x0000000000000000L,0x0000000060000000L});
	public static final BitSet FOLLOW_T_IF_in_attachClusterStatement2615 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_T_NOT_in_attachClusterStatement2617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_T_EXISTS_in_attachClusterStatement2619 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_T_IDENT_in_attachClusterStatement2631 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_T_ON_in_attachClusterStatement2637 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_T_DATASTORE_in_attachClusterStatement2639 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_T_IDENT_in_attachClusterStatement2643 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_T_WITH_in_attachClusterStatement2650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_T_OPTIONS_in_attachClusterStatement2652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000500000L});
	public static final BitSet FOLLOW_getJson_in_attachClusterStatement2656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DETACH_in_detachClusterStatement2682 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_T_CLUSTER_in_detachClusterStatement2684 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_T_IDENT_in_detachClusterStatement2688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ALTER_in_alterClusterStatement2720 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_T_CLUSTER_in_alterClusterStatement2722 = new BitSet(new long[]{0x0000000000000000L,0x0000000060000000L});
	public static final BitSet FOLLOW_T_IF_in_alterClusterStatement2725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_T_EXISTS_in_alterClusterStatement2727 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_T_IDENT_in_alterClusterStatement2736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_T_WITH_in_alterClusterStatement2738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_T_OPTIONS_in_alterClusterStatement2740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000500000L});
	public static final BitSet FOLLOW_getJson_in_alterClusterStatement2744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ATTACH_in_attachConnectorStatement2780 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_T_CONNECTOR_in_attachConnectorStatement2782 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_T_IDENT_in_attachConnectorStatement2786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_T_TO_in_attachConnectorStatement2788 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_T_IDENT_in_attachConnectorStatement2792 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_T_WITH_in_attachConnectorStatement2795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_T_OPTIONS_in_attachConnectorStatement2797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000500000L});
	public static final BitSet FOLLOW_getJson_in_attachConnectorStatement2801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DETACH_in_detachConnectorStatement2827 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_T_CONNECTOR_in_detachConnectorStatement2829 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_T_IDENT_in_detachConnectorStatement2833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_T_FROM_in_detachConnectorStatement2835 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_T_IDENT_in_detachConnectorStatement2839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CREATE_in_createCatalogStatement2867 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_T_CATALOG_in_createCatalogStatement2869 = new BitSet(new long[]{0x0000000000000000L,0x0000000060000000L});
	public static final BitSet FOLLOW_T_IF_in_createCatalogStatement2876 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_T_NOT_in_createCatalogStatement2878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_T_EXISTS_in_createCatalogStatement2880 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_T_IDENT_in_createCatalogStatement2892 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_T_WITH_in_createCatalogStatement2899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000500000L});
	public static final BitSet FOLLOW_getJson_in_createCatalogStatement2903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DROP_in_dropCatalogStatement2935 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_T_CATALOG_in_dropCatalogStatement2937 = new BitSet(new long[]{0x0000000000000000L,0x0000000060000000L});
	public static final BitSet FOLLOW_T_IF_in_dropCatalogStatement2944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_T_EXISTS_in_dropCatalogStatement2946 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_T_IDENT_in_dropCatalogStatement2958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ALTER_in_alterCatalogStatement2980 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_T_CATALOG_in_alterCatalogStatement2982 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_T_IDENT_in_alterCatalogStatement2990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_T_WITH_in_alterCatalogStatement2996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000500000L});
	public static final BitSet FOLLOW_getJson_in_alterCatalogStatement3000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DESCRIBE_in_describeStatement3029 = new BitSet(new long[]{0xC0C5C00000000000L,0x0000000000000000L,0x0000000018000000L});
	public static final BitSet FOLLOW_T_CATALOG_in_describeStatement3041 = new BitSet(new long[]{0x0400500000000000L,0x0E30410838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getGenericID_in_describeStatement3045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CATALOGS_in_describeStatement3056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_TABLE_in_describeStatement3070 = new BitSet(new long[]{0x0400500000000000L,0x0E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getTableName_in_describeStatement3074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_TABLES_in_describeStatement3088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CLUSTER_in_describeStatement3102 = new BitSet(new long[]{0x0400500000000000L,0x0E30410838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getGenericID_in_describeStatement3106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CLUSTERS_in_describeStatement3120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DATASTORE_in_describeStatement3134 = new BitSet(new long[]{0x0400500000000000L,0x0E30410838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getGenericID_in_describeStatement3138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DATASTORES_in_describeStatement3152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CONNECTOR_in_describeStatement3166 = new BitSet(new long[]{0x0400500000000000L,0x0E30410838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getGenericID_in_describeStatement3170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CONNECTORS_in_describeStatement3184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DELETE_in_deleteStatement3211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_T_FROM_in_deleteStatement3213 = new BitSet(new long[]{0x0400500000000000L,0x0E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getTableName_in_deleteStatement3217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_T_WHERE_in_deleteStatement3220 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484520784AL});
	public static final BitSet FOLLOW_getWhereClauses_in_deleteStatement3224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ADD_in_addStatement3241 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_QUOTED_LITERAL_in_addStatement3245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DROP_in_dropManifestStatement3272 = new BitSet(new long[]{0x4040000000000000L});
	public static final BitSet FOLLOW_T_DATASTORE_in_dropManifestStatement3275 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_T_CONNECTOR_in_dropManifestStatement3279 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_T_IDENT_in_dropManifestStatement3287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_LIST_in_listStatement3307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008400000040L});
	public static final BitSet FOLLOW_getListTypes_in_listStatement3312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_REMOVE_in_removeUDFStatement3330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_T_UDF_in_removeUDFStatement3332 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_QUOTED_LITERAL_in_removeUDFStatement3336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DROP_in_dropIndexStatement3357 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_T_INDEX_in_dropIndexStatement3359 = new BitSet(new long[]{0x1000000000000000L,0x0000080040000000L});
	public static final BitSet FOLLOW_T_IF_in_dropIndexStatement3363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_T_EXISTS_in_dropIndexStatement3365 = new BitSet(new long[]{0x1000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_getIndexName_in_dropIndexStatement3375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CREATE_in_createIndexStatement3403 = new BitSet(new long[]{0x2000000000000000L,0x0000000100800004L});
	public static final BitSet FOLLOW_getIndexType_in_createIndexStatement3410 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_T_INDEX_in_createIndexStatement3416 = new BitSet(new long[]{0x1400500000000000L,0x8E30490878000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_T_IF_in_createIndexStatement3420 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_T_NOT_in_createIndexStatement3422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_T_EXISTS_in_createIndexStatement3424 = new BitSet(new long[]{0x1400500000000000L,0x8E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getColumnName_in_createIndexStatement3434 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_T_ON_in_createIndexStatement3443 = new BitSet(new long[]{0x0400500000000000L,0x0E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getTableName_in_createIndexStatement3447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_T_START_PARENTHESIS_in_createIndexStatement3452 = new BitSet(new long[]{0x1400500000000000L,0x0E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getColumnName_in_createIndexStatement3464 = new BitSet(new long[]{0x0010000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_T_COMMA_in_createIndexStatement3471 = new BitSet(new long[]{0x1400500000000000L,0x0E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getColumnName_in_createIndexStatement3477 = new BitSet(new long[]{0x0010000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_T_END_PARENTHESIS_in_createIndexStatement3487 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000840000000000L});
	public static final BitSet FOLLOW_T_USING_in_createIndexStatement3491 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_QUOTED_LITERAL_in_createIndexStatement3495 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_T_WITH_in_createIndexStatement3503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000500000L});
	public static final BitSet FOLLOW_getJson_in_createIndexStatement3507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DEFAULT_in_getIndexType3533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FULL_TEXT_in_getIndexType3543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CUSTOM_in_getIndexType3553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getUnits_in_getField3579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_getField3590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_getUnits3621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_UPDATE_in_updateTableStatement3725 = new BitSet(new long[]{0x0400500000000000L,0x0E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getTableName_in_updateTableStatement3729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000020000L});
	public static final BitSet FOLLOW_T_USING_in_updateTableStatement3736 = new BitSet(new long[]{0x1622520002000000L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getOption_in_updateTableStatement3740 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_T_AND_in_updateTableStatement3746 = new BitSet(new long[]{0x1622520002000000L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getOption_in_updateTableStatement3750 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_T_SET_in_updateTableStatement3763 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getAssignment_in_updateTableStatement3767 = new BitSet(new long[]{0x0010000000000002L,0x0000000040000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_T_COMMA_in_updateTableStatement3773 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getAssignment_in_updateTableStatement3777 = new BitSet(new long[]{0x0010000000000002L,0x0000000040000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_T_WHERE_in_updateTableStatement3789 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484520784AL});
	public static final BitSet FOLLOW_getWhereClauses_in_updateTableStatement3793 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
	public static final BitSet FOLLOW_T_IF_in_updateTableStatement3803 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getSelector_in_updateTableStatement3807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_T_EQUAL_in_updateTableStatement3810 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getSelector_in_updateTableStatement3814 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_AND_in_updateTableStatement3840 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getSelector_in_updateTableStatement3844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_T_EQUAL_in_updateTableStatement3847 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getSelector_in_updateTableStatement3851 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_STOP_in_stopProcessStatement3880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_T_PROCESS_in_stopProcessStatement3882 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_T_IDENT_in_stopProcessStatement3886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DROP_in_dropTriggerStatement3904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_T_TRIGGER_in_dropTriggerStatement3910 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_T_IDENT_in_dropTriggerStatement3914 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_T_ON_in_dropTriggerStatement3920 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_T_IDENT_in_dropTriggerStatement3928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CREATE_in_createTriggerStatement3954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_T_TRIGGER_in_createTriggerStatement3960 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_T_IDENT_in_createTriggerStatement3964 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_T_ON_in_createTriggerStatement3970 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_T_IDENT_in_createTriggerStatement3978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_T_USING_in_createTriggerStatement3984 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_T_IDENT_in_createTriggerStatement3988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CREATE_in_createTableStatement4018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L,0x0000000008000000L});
	public static final BitSet FOLLOW_getTableType_in_createTableStatement4022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_T_TABLE_in_createTableStatement4024 = new BitSet(new long[]{0x0400500000000000L,0x0E30490878000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_T_IF_in_createTableStatement4027 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_T_NOT_in_createTableStatement4029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_T_EXISTS_in_createTableStatement4031 = new BitSet(new long[]{0x0400500000000000L,0x0E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getTableName_in_createTableStatement4043 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_T_ON_in_createTableStatement4049 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_T_CLUSTER_in_createTableStatement4055 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_T_IDENT_in_createTableStatement4059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_T_START_PARENTHESIS_in_createTableStatement4065 = new BitSet(new long[]{0x1400500000000000L,0x0E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getColumnName_in_createTableStatement4077 = new BitSet(new long[]{0x0000180000000000L,0x0020801800100200L,0x0000100040020000L});
	public static final BitSet FOLLOW_getDataType_in_createTableStatement4082 = new BitSet(new long[]{0x0010000000000000L,0x0000000000002000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_PRIMARY_in_createTableStatement4085 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_T_KEY_in_createTableStatement4087 = new BitSet(new long[]{0x0010000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_T_COMMA_in_createTableStatement4105 = new BitSet(new long[]{0x1400500000000000L,0x0E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getColumnName_in_createTableStatement4109 = new BitSet(new long[]{0x0000180000000000L,0x0020801800100200L,0x0000100040020000L});
	public static final BitSet FOLLOW_getDataType_in_createTableStatement4114 = new BitSet(new long[]{0x0010000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_T_COMMA_in_createTableStatement4130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_PRIMARY_in_createTableStatement4132 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_T_KEY_in_createTableStatement4134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_T_START_PARENTHESIS_in_createTableStatement4136 = new BitSet(new long[]{0x1400500000000000L,0x0E30490838000003L,0x000000404120784AL});
	public static final BitSet FOLLOW_getColumnName_in_createTableStatement4157 = new BitSet(new long[]{0x0010000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_T_START_PARENTHESIS_in_createTableStatement4180 = new BitSet(new long[]{0x1400500000000000L,0x0E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getColumnName_in_createTableStatement4204 = new BitSet(new long[]{0x0010000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_T_COMMA_in_createTableStatement4230 = new BitSet(new long[]{0x1400500000000000L,0x0E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getColumnName_in_createTableStatement4234 = new BitSet(new long[]{0x0010000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_T_END_PARENTHESIS_in_createTableStatement4278 = new BitSet(new long[]{0x0010000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_T_COMMA_in_createTableStatement4298 = new BitSet(new long[]{0x1400500000000000L,0x0E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getColumnName_in_createTableStatement4302 = new BitSet(new long[]{0x0010000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_T_END_PARENTHESIS_in_createTableStatement4317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_T_END_PARENTHESIS_in_createTableStatement4325 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_T_WITH_in_createTableStatement4328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000500000L});
	public static final BitSet FOLLOW_getJson_in_createTableStatement4332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_EPHEMERAL_in_getTableType4366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ALTER_in_alterTableStatement4395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_T_TABLE_in_alterTableStatement4397 = new BitSet(new long[]{0x0400500000000000L,0x0E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getTableName_in_alterTableStatement4401 = new BitSet(new long[]{0x0000000120000002L,0x0000000000000400L,0x0000800000000000L});
	public static final BitSet FOLLOW_T_ALTER_in_alterTableStatement4408 = new BitSet(new long[]{0x1400500000000000L,0x0E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getColumnName_in_alterTableStatement4412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_T_TYPE_in_alterTableStatement4415 = new BitSet(new long[]{0x0000180000000000L,0x0020801800100200L,0x0000100040020000L});
	public static final BitSet FOLLOW_getDataType_in_alterTableStatement4419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ADD_in_alterTableStatement4432 = new BitSet(new long[]{0x1400500000000000L,0x0E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getColumnName_in_alterTableStatement4436 = new BitSet(new long[]{0x0000180000000000L,0x0020801800100200L,0x0000100040020000L});
	public static final BitSet FOLLOW_getDataType_in_alterTableStatement4441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DROP_in_alterTableStatement4454 = new BitSet(new long[]{0x1400500000000000L,0x0E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getColumnName_in_alterTableStatement4458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_WITH_in_alterTableStatement4473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000500000L});
	public static final BitSet FOLLOW_getJson_in_alterTableStatement4479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_SELECT_in_selectStatement4525 = new BitSet(new long[]{0x1600524002000000L,0x0FB0490838180103L,0x000000484500784AL});
	public static final BitSet FOLLOW_getSelectExpression_in_selectStatement4529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_T_FROM_in_selectStatement4532 = new BitSet(new long[]{0x0400500000000000L,0x0E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getAliasedTableID_in_selectStatement4536 = new BitSet(new long[]{0x0000000000000002L,0x0000400201000000L,0x0000A00000000004L});
	public static final BitSet FOLLOW_T_WITH_in_selectStatement4544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_T_WINDOW_in_selectStatement4546 = new BitSet(new long[]{0x0200000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_getWindow_in_selectStatement4552 = new BitSet(new long[]{0x0000000000000002L,0x0000400201000000L,0x0000200000000004L});
	public static final BitSet FOLLOW_T_INNER_in_selectStatement4561 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_T_JOIN_in_selectStatement4563 = new BitSet(new long[]{0x0400500000000000L,0x0E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getAliasedTableID_in_selectStatement4569 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_T_ON_in_selectStatement4572 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484520784AL});
	public static final BitSet FOLLOW_getWhereClauses_in_selectStatement4576 = new BitSet(new long[]{0x0000000000000002L,0x0000400001000000L,0x0000200000000004L});
	public static final BitSet FOLLOW_T_WHERE_in_selectStatement4586 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484520784AL});
	public static final BitSet FOLLOW_getWhereClauses_in_selectStatement4592 = new BitSet(new long[]{0x0000000000000002L,0x0000400001000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_T_ORDER_in_selectStatement4602 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_T_BY_in_selectStatement4604 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getOrdering_in_selectStatement4610 = new BitSet(new long[]{0x0000000000000002L,0x0000400001000000L});
	public static final BitSet FOLLOW_T_GROUP_in_selectStatement4620 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_T_BY_in_selectStatement4622 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getGroupBy_in_selectStatement4628 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
	public static final BitSet FOLLOW_T_LIMIT_in_selectStatement4638 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_T_CONSTANT_in_selectStatement4644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_INSERT_in_insertIntoStatement4676 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_T_INTO_in_insertIntoStatement4678 = new BitSet(new long[]{0x0400500000000000L,0x0E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getTableName_in_insertIntoStatement4682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_T_START_PARENTHESIS_in_insertIntoStatement4688 = new BitSet(new long[]{0x1400500000000000L,0x0E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getColumnName_in_insertIntoStatement4700 = new BitSet(new long[]{0x0010000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_T_COMMA_in_insertIntoStatement4706 = new BitSet(new long[]{0x1400500000000000L,0x0E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getColumnName_in_insertIntoStatement4710 = new BitSet(new long[]{0x0010000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_T_END_PARENTHESIS_in_insertIntoStatement4721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000008000L});
	public static final BitSet FOLLOW_selectStatement_in_insertIntoStatement4739 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_T_VALUES_in_insertIntoStatement4761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_T_START_PARENTHESIS_in_insertIntoStatement4771 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getSelector_in_insertIntoStatement4787 = new BitSet(new long[]{0x0010000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_T_COMMA_in_insertIntoStatement4805 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getSelector_in_insertIntoStatement4809 = new BitSet(new long[]{0x0010000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_T_END_PARENTHESIS_in_insertIntoStatement4824 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_T_IF_in_insertIntoStatement4837 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_T_NOT_in_insertIntoStatement4839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_T_EXISTS_in_insertIntoStatement4841 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_T_USING_in_insertIntoStatement4862 = new BitSet(new long[]{0x1622520002000000L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getOption_in_insertIntoStatement4876 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_AND_in_insertIntoStatement4890 = new BitSet(new long[]{0x1622520002000000L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getOption_in_insertIntoStatement4894 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_EXPLAIN_in_explainPlanStatement4928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_T_PLAN_in_explainPlanStatement4930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_T_FOR_in_explainPlanStatement4932 = new BitSet(new long[]{0x0800010120000000L,0x0000800400040468L,0x0000011000908200L});
	public static final BitSet FOLLOW_metaStatement_in_explainPlanStatement4936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DROP_in_dropTableStatement4967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_T_TABLE_in_dropTableStatement4969 = new BitSet(new long[]{0x0400500000000000L,0x0E30490878000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_T_IF_in_dropTableStatement4972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_T_EXISTS_in_dropTableStatement4974 = new BitSet(new long[]{0x0400500000000000L,0x0E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getTableName_in_dropTableStatement4986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_TRUNCATE_in_truncateStatement5001 = new BitSet(new long[]{0x0400500000000000L,0x0E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getTableName_in_truncateStatement5013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_START_BRACKET_in_metaStatement5032 = new BitSet(new long[]{0x0400500000000000L,0x0E30410838001003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getGenericID_in_metaStatement5046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_T_END_BRACKET_in_metaStatement5057 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_T_COMMA_in_metaStatement5059 = new BitSet(new long[]{0x0800010120000000L,0x0000800400040468L,0x0000011000808200L});
	public static final BitSet FOLLOW_insertIntoStatement_in_metaStatement5074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectStatement_in_metaStatement5088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createTableStatement_in_metaStatement5102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterTableStatement_in_metaStatement5116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateTableStatement_in_metaStatement5130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropTableStatement_in_metaStatement5144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_truncateStatement_in_metaStatement5158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listStatement_in_metaStatement5172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stopProcessStatement_in_metaStatement5186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_explainPlanStatement_in_metaStatement5200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addStatement_in_metaStatement5214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropManifestStatement_in_metaStatement5228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_removeUDFStatement_in_metaStatement5242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deleteStatement_in_metaStatement5256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_describeStatement_in_metaStatement5270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createCatalogStatement_in_metaStatement5284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterCatalogStatement_in_metaStatement5298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropCatalogStatement_in_metaStatement5312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attachClusterStatement_in_metaStatement5326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_detachClusterStatement_in_metaStatement5340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterClusterStatement_in_metaStatement5354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attachConnectorStatement_in_metaStatement5368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_detachConnectorStatement_in_metaStatement5382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createIndexStatement_in_metaStatement5396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropIndexStatement_in_metaStatement5410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createTriggerStatement_in_metaStatement5424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropTriggerStatement_in_metaStatement5438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_metaStatement_in_query5456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_T_SEMICOLON_in_query5459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_EOF_in_query5463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getBasicType_in_getDataType5485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getCollectionType_in_getDataType5495 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_T_LT_in_getDataType5497 = new BitSet(new long[]{0x0000180000000000L,0x0000001800100200L,0x0000100040000000L});
	public static final BitSet FOLLOW_getBasicType_in_getDataType5501 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_T_GT_in_getDataType5503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getMapType_in_getDataType5515 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_T_LT_in_getDataType5517 = new BitSet(new long[]{0x0000180000000000L,0x0000001800100200L,0x0000100040000000L});
	public static final BitSet FOLLOW_getBasicType_in_getDataType5521 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_T_COMMA_in_getDataType5523 = new BitSet(new long[]{0x0000180000000000L,0x0000001800100200L,0x0000100040000000L});
	public static final BitSet FOLLOW_getBasicType_in_getDataType5527 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_T_GT_in_getDataType5529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_BIGINT_in_getBasicType5555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_BOOLEAN_in_getBasicType5565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DOUBLE_in_getBasicType5575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FLOAT_in_getBasicType5585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_INT_in_getBasicType5595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_INTEGER_in_getBasicType5605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_TEXT_in_getBasicType5615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_VARCHAR_in_getBasicType5625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_SET_in_getCollectionType5643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_LIST_in_getCollectionType5653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_MAP_in_getMapType5671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getSelector_in_getOrdering5708 = new BitSet(new long[]{0x0010002000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_T_COMMA_in_getOrdering5718 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getSelector_in_getOrdering5722 = new BitSet(new long[]{0x0010002000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_T_ASC_in_getOrdering5734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DESC_in_getOrdering5738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getSelector_in_getGroupBy5770 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_T_COMMA_in_getGroupBy5780 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getSelector_in_getGroupBy5784 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_T_START_PARENTHESIS_in_getWhereClauses5814 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getRelation_in_getWhereClauses5818 = new BitSet(new long[]{0x0000000400000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_T_AND_in_getWhereClauses5824 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484520784AL});
	public static final BitSet FOLLOW_getWhereClauses_in_getWhereClauses5828 = new BitSet(new long[]{0x0000000400000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_T_END_PARENTHESIS_in_getWhereClauses5835 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_AND_in_getWhereClauses5838 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484520784AL});
	public static final BitSet FOLLOW_getWhereClauses_in_getWhereClauses5842 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_getRelation_in_getWhereClauses5857 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_AND_in_getWhereClauses5863 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484520784AL});
	public static final BitSet FOLLOW_getWhereClauses_in_getWhereClauses5867 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_getSelector_in_getRelation5899 = new BitSet(new long[]{0x0000000000000000L,0x204C200006010000L});
	public static final BitSet FOLLOW_getComparator_in_getRelation5904 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getSelector_in_getRelation5908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getTableName_in_getFields5924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_T_EQUAL_in_getFields5928 = new BitSet(new long[]{0x0400500000000000L,0x0E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getTableName_in_getFields5932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_START_PARENTHESIS_in_getFields5942 = new BitSet(new long[]{0x0400500000000000L,0x0E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getTableName_in_getFields5946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_T_EQUAL_in_getFields5950 = new BitSet(new long[]{0x0400500000000000L,0x0E30490838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getTableName_in_getFields5954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_T_END_PARENTHESIS_in_getFields5958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_LAST_in_getWindow5975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CONSTANT_in_getWindow5987 = new BitSet(new long[]{0x0000000000000000L,0x0B00000018000003L,0x0000000000006C00L});
	public static final BitSet FOLLOW_T_ROWS_in_getWindow5990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getTimeUnit_in_getWindow6021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_SEC_in_getTimeUnit6072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_SECS_in_getTimeUnit6082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_SECONDS_in_getTimeUnit6092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_MIN_in_getTimeUnit6102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_MINS_in_getTimeUnit6112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_MINUTES_in_getTimeUnit6122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_HOUR_in_getTimeUnit6132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_HOURS_in_getTimeUnit6142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DAY_in_getTimeUnit6152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DAYS_in_getTimeUnit6162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DISTINCT_in_getSelectExpression6199 = new BitSet(new long[]{0x1600524002000000L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_T_ASTERISK_in_getSelectExpression6219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getSelector_in_getSelectExpression6235 = new BitSet(new long[]{0x0010001000000002L});
	public static final BitSet FOLLOW_T_AS_in_getSelectExpression6257 = new BitSet(new long[]{0x0400500000000000L,0x0E30410838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getGenericID_in_getSelectExpression6261 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_T_COMMA_in_getSelectExpression6299 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getSelector_in_getSelectExpression6303 = new BitSet(new long[]{0x0010001000000002L});
	public static final BitSet FOLLOW_T_AS_in_getSelectExpression6329 = new BitSet(new long[]{0x0400500000000000L,0x0E30410838000003L,0x000000404100784AL});
	public static final BitSet FOLLOW_getGenericID_in_getSelectExpression6333 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_T_SUM_in_getSelector6406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_T_MAX_in_getSelector6424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_T_MIN_in_getSelector6442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_T_AVG_in_getSelector6460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_T_COUNT_in_getSelector6478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_T_IDENT_in_getSelector6496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_T_START_PARENTHESIS_in_getSelector6516 = new BitSet(new long[]{0x1600524002000000L,0x0FB0490838182003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getSelector_in_getSelector6533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_T_ASTERISK_in_getSelector6552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_T_END_PARENTHESIS_in_getSelector6579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getColumnName_in_getSelector6617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FLOAT_in_getSelector6638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CONSTANT_in_getSelector6658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FALSE_in_getSelector6676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_TRUE_in_getSelector6694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_LITERAL_in_getSelector6714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_getListTypes6747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getSelector_in_getAssignment6786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_T_EQUAL_in_getAssignment6789 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getRightTermInAssignment_in_getAssignment6793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getSelector_in_getRightTermInAssignment6830 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000000L,0x0000000002080010L});
	public static final BitSet FOLLOW_getOperator_in_getRightTermInAssignment6836 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getRightTermInAssignment_in_getRightTermInAssignment6840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_PLUS_in_getOperator6866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_SUBTRACT_in_getOperator6876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ASTERISK_in_getOperator6886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_SLASH_in_getOperator6896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_EQUAL_in_getComparator6914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_GT_in_getComparator6924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_LT_in_getComparator6934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_GTE_in_getComparator6944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_LTE_in_getComparator6954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_NOT_EQUAL_in_getComparator6964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_LIKE_in_getComparator6974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_MATCH_in_getComparator6984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IDENT_in_getIds7012 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_T_COMMA_in_getIds7017 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_T_IDENT_in_getIds7021 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_getOption_in_getOptions7047 = new BitSet(new long[]{0x1622520002000002L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getOption_in_getOptions7055 = new BitSet(new long[]{0x1622520002000002L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_T_COMPACT_in_getOption7077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_T_STORAGE_in_getOption7079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CLUSTERING_in_getOption7089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_T_ORDER_in_getOption7091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getSelector_in_getOption7103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_T_EQUAL_in_getOption7106 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getSelector_in_getOption7110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getSelector_in_getSelectors7140 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_T_COMMA_in_getSelectors7150 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getSelector_in_getSelectors7154 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_getTableName_in_getAliasedTableID7175 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_T_AS_in_getAliasedTableID7178 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_T_IDENT_in_getAliasedTableID7182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IDENT_in_getColumnName7210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_KS_AND_TN_in_getColumnName7222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CTLG_TBL_COL_in_getColumnName7234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getAllowedReservedWord_in_getColumnName7246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_getIndexName7267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_getAllowedReservedWord7314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getAllowedReservedWord_in_getGenericID7532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IDENT_in_getGenericID7544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getGenericID_in_getTableName7565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_KS_AND_TN_in_getTableName7577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_TERM_in_getFloat7601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FLOAT_in_getFloat7615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getObjectJson_in_getJson7636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getArrayJson_in_getJson7648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_START_SBRACKET_in_getObjectJson7684 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getPairJson_in_getObjectJson7690 = new BitSet(new long[]{0x0010000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_T_COMMA_in_getObjectJson7695 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484500784AL});
	public static final BitSet FOLLOW_getPairJson_in_getObjectJson7701 = new BitSet(new long[]{0x0010000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_T_END_SBRACKET_in_getObjectJson7707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_START_SBRACKET_in_getObjectJson7717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_T_END_SBRACKET_in_getObjectJson7721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getSelector_in_getPairJson7758 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_T_COLON_in_getPairJson7767 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484550784AL});
	public static final BitSet FOLLOW_getValueJson_in_getPairJson7777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_START_BRACKET_in_getArrayJson7812 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484550784AL});
	public static final BitSet FOLLOW_getValueJson_in_getArrayJson7818 = new BitSet(new long[]{0x0010000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_T_COMMA_in_getArrayJson7831 = new BitSet(new long[]{0x1600520002000000L,0x0FB0490838180003L,0x000000484550784AL});
	public static final BitSet FOLLOW_getValueJson_in_getArrayJson7837 = new BitSet(new long[]{0x0010000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_T_END_BRACKET_in_getArrayJson7843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_START_BRACKET_in_getArrayJson7853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_T_END_BRACKET_in_getArrayJson7857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getSelector_in_getValueJson7895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getObjectJson_in_getValueJson7908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getArrayJson_in_getValueJson7920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IDENT_in_getColumn7958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_KS_AND_TN_in_getColumn7970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CTLG_TBL_COL_in_getColumn7982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IDENT_in_getTable8020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_KS_AND_TN_in_getTable8032 = new BitSet(new long[]{0x0000000000000002L});
}
