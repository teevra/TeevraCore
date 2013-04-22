/* Generated by Xgen from: E110.04.05 SIR 108133 on: 2008-06-05 09:51 */
/*******************************************************************************
* 2008 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   SubTrdConf.hxx
*
*  DESCRIPTION: Layouts used for
*               Subscribe Trade Confirmation
*
*******************************************************************************/

#ifndef _SUBTRDCONF_HXX_
#define _SUBTRDCONF_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _FUT_BSC_SUB_TRD_CONF_PRIV_BCAST_T_
#define _FUT_BSC_SUB_TRD_CONF_PRIV_BCAST_T_

typedef struct futBscSubTrdConfPrivBcastTag
{
    char             posTrnTyp       [POS_TRN_TYP_LEN];
    char             buyCod;
    futCntrIdGrpT    futCntrIdGrp;
    char             dblLegTyp       [DBL_LEG_TYP_LEN];
    char             stratTyp        [STRAT_TYP_LEN];
    char             membExchIdCod   [MEMB_EXCH_ID_COD_LEN];
    trdrIdGrpT       trdrIdGrp;
    char             trnIdNo         [TRN_ID_NO_LEN];
    trnIdSfxGrpT     trnIdSfxGrp;
    char             shtQty          [DRIV_VOLUME_LEN];
    char             lngQty          [DRIV_VOLUME_LEN];
    char             trdMtchPrc      [DRIV_PRICE_LEN];
    char             agrsrMtchInd;
    char             trnDat          [DRIV_DATE_LEN];
    char             trnTim          [DRIV_TIME_LEN];
    char             trdTyp;
    char             ordrNo          [DRIV_ORDR_NO_LEN];
    char             ordrTypCod;
    char             ordrResCod;
    char             opnClsCod;
    char             ordrQty         [DRIV_VOLUME_LEN];
    char             ordrDat         [DRIV_DATE_LEN];
    char             currTypCod      [CURR_TYP_COD_LEN];
    char             dcmlShft;
    char             exerPrcDcml;
    char             prodDispDcml    [PROD_DISP_DCML_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} futBscSubTrdConfPrivBcastT, *pFutBscSubTrdConfPrivBcastT;

#endif  /* _FUT_BSC_SUB_TRD_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _FUT_EXT_SUB_TRD_CONF_PRIV_BCAST_T_
#define _FUT_EXT_SUB_TRD_CONF_PRIV_BCAST_T_

typedef struct futExtSubTrdConfPrivBcastTag
{
    acctTypCodGrpT   acctTypCodGrp;
    txtGrpT          txtGrp;
    char             ordrPrtFilCod;
    char             membClgIdCod    [MEMB_CLG_ID_COD_LEN];
    char             isinCod         [ISIN_COD_LEN];
    gutGrpT          gutGrp;
    char             grsBas          [GRS_BAS_LEN];
    char             undrIsinCod     [UNDR_ISIN_COD_LEN];
    char             dsgnOpnLng      [DRIV_QUANTITY_LEN];
    char             dsgnOpnSht      [DRIV_QUANTITY_LEN];
    char             bonIsinCod      [BON_ISIN_COD_LEN];
    char             prmAmnt         [DRIV_PRM_AMNT_LEN];
    char             trnFeeAmnt      [DRIV_AMOUNT_LEN];
    char             cshValDat       [DRIV_DATE_LEN];
    char             secuValDat      [DRIV_DATE_LEN];
    char             swapEndDat      [DRIV_DATE_LEN];
    char             cpnFixRat       [CPN_FIX_RAT_LEN];
    origTrnGrpT      origTrnGrp;
} futExtSubTrdConfPrivBcastT, *pFutExtSubTrdConfPrivBcastT;

#endif  /* _FUT_EXT_SUB_TRD_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _FUT_SUB_TRD_CONF_PRIV_BCAST_T_
#define _FUT_SUB_TRD_CONF_PRIV_BCAST_T_

typedef struct futSubTrdConfPrivBcastTag
{
    futBscSeqNoT     seqNo;
    dataHeaderT      header;
    futBscSubTrdConfPrivBcastT basic;
    futExtSubTrdConfPrivBcastT extension;
} futSubTrdConfPrivBcastT, *pFutSubTrdConfPrivBcastT;

#endif  /* _FUT_SUB_TRD_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_SUB_TRD_CONF_SUBJECT_T_
#define _FUT_BSC_SUB_TRD_CONF_SUBJECT_T_

typedef struct futBscSubTrdConfSubjectTag
{
    char             membId          [MEMB_ID_LEN];
    char             prodId          [PROD_ID_LEN];
    char             cntrExpYrDat    [CNTR_EXP_YR_DAT_LEN];
    char             cntrExpMthDat   [CNTR_EXP_MTH_DAT_LEN];
    char             subjFill        [SUBJ_FILL_LEN];
} futBscSubTrdConfSubjectT, *pFutBscSubTrdConfSubjectT;

#endif  /* _FUT_BSC_SUB_TRD_CONF_SUBJECT_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_SUB_TRD_CONF_PRIV_BCAST_T_
#define _OPT_BSC_SUB_TRD_CONF_PRIV_BCAST_T_

typedef struct optBscSubTrdConfPrivBcastTag
{
    char             posTrnTyp       [POS_TRN_TYP_LEN];
    char             buyCod;
    optCntrIdGrpT    optCntrIdGrp;
    char             dblLegTyp       [DBL_LEG_TYP_LEN];
    char             stratTyp        [STRAT_TYP_LEN];
    char             membExchIdCod   [MEMB_EXCH_ID_COD_LEN];
    trdrIdGrpT       trdrIdGrp;
    char             trnIdNo         [TRN_ID_NO_LEN];
    trnIdSfxGrpT     trnIdSfxGrp;
    char             shtQty          [DRIV_VOLUME_LEN];
    char             lngQty          [DRIV_VOLUME_LEN];
    char             trdMtchPrc      [DRIV_PRICE_LEN];
    char             agrsrMtchInd;
    char             trnDat          [DRIV_DATE_LEN];
    char             trnTim          [DRIV_TIME_LEN];
    char             trdTyp;
    char             ordrNo          [DRIV_ORDR_NO_LEN];
    char             ordrTypCod;
    char             ordrResCod;
    char             opnClsCod;
    char             ordrQty         [DRIV_VOLUME_LEN];
    char             ordrDat         [DRIV_DATE_LEN];
    char             currTypCod      [CURR_TYP_COD_LEN];
    char             dcmlShft;
    char             exerPrcDcml;
    char             prodDispDcml    [PROD_DISP_DCML_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} optBscSubTrdConfPrivBcastT, *pOptBscSubTrdConfPrivBcastT;

#endif  /* _OPT_BSC_SUB_TRD_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _OPT_EXT_SUB_TRD_CONF_PRIV_BCAST_T_
#define _OPT_EXT_SUB_TRD_CONF_PRIV_BCAST_T_

typedef struct optExtSubTrdConfPrivBcastTag
{
    acctTypCodGrpT   acctTypCodGrp;
    txtGrpT          txtGrp;
    char             ordrPrtFilCod;
    char             membClgIdCod    [MEMB_CLG_ID_COD_LEN];
    char             isinCod         [ISIN_COD_LEN];
    gutGrpT          gutGrp;
    char             dsgnOpnLng      [DRIV_QUANTITY_LEN];
    char             dsgnOpnSht      [DRIV_QUANTITY_LEN];
    char             bonIsinCod      [BON_ISIN_COD_LEN];
    char             prmAmnt         [DRIV_PRM_AMNT_LEN];
    char             trnFeeAmnt      [DRIV_AMOUNT_LEN];
    char             cshValDat       [DRIV_DATE_LEN];
    char             secuValDat      [DRIV_DATE_LEN];
    origTrnGrpT      origTrnGrp;
} optExtSubTrdConfPrivBcastT, *pOptExtSubTrdConfPrivBcastT;

#endif  /* _OPT_EXT_SUB_TRD_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _OPT_SUB_TRD_CONF_PRIV_BCAST_T_
#define _OPT_SUB_TRD_CONF_PRIV_BCAST_T_

typedef struct optSubTrdConfPrivBcastTag
{
    optBscSeqNoT     seqNo;
    dataHeaderT      header;
    optBscSubTrdConfPrivBcastT basic;
    optExtSubTrdConfPrivBcastT extension;
} optSubTrdConfPrivBcastT, *pOptSubTrdConfPrivBcastT;

#endif  /* _OPT_SUB_TRD_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_SUB_TRD_CONF_SUBJECT_T_
#define _OPT_BSC_SUB_TRD_CONF_SUBJECT_T_

typedef struct optBscSubTrdConfSubjectTag
{
    char             membId          [MEMB_ID_LEN];
    char             prodId          [PROD_ID_LEN];
    char             cntrExpYrDat    [CNTR_EXP_YR_DAT_LEN];
    char             cntrExpMthDat   [CNTR_EXP_MTH_DAT_LEN];
    char             cntrClasCod;
    char             cntrExerPrc     [CNTR_EXER_PRC_LEN];
    char             cntrVersNo;
} optBscSubTrdConfSubjectT, *pOptBscSubTrdConfSubjectT;

#endif  /* _OPT_BSC_SUB_TRD_CONF_SUBJECT_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _SUBTRDCONF_HXX_ */

/******************************************************************************/
/* End of file SubTrdConf.hxx */
/******************************************************************************/