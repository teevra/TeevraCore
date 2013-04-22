/* Generated by Xgen from: E120.23.01 SIR 132470 on: 2009-06-02 16:47 */
/*******************************************************************************
* 2009 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   SubBOInfo.hxx
*
*  DESCRIPTION: Layouts used for
*               Subscribe BO Information
*
*******************************************************************************/

#ifndef _SUBBOINFO_HXX_
#define _SUBBOINFO_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define EXT_EXCH_RAT_TRN_REC_MAX                 19
#define EXT_SETL_PRC_TRN_REC_MAX                 24

/******************************************************************************/

#ifndef _EXT_CAP_ADJ_TRN_PUB_BCAST_T_
#define _EXT_CAP_ADJ_TRN_PUB_BCAST_T_

typedef struct extCapAdjTrnPubBcastTag
{
    char             boiTrnTyp       [BOI_TRN_TYP_LEN];
    char             capAdjTrnTyp    [CAP_ADJ_TRN_TYP_LEN];
    char             capAdjEffDat    [DRIV_DATE_LEN];
    char             prodId          [PROD_ID_LEN];
    char             prodId2         [DRIV_PROD_ID2_LEN];
    char             isinCod         [ISIN_COD_LEN];
    char             capAdjRtio      [CAP_ADJ_RTIO_LEN];
    char             cshValDat       [DRIV_DATE_LEN];
    char             secuValDat      [DRIV_DATE_LEN];
} extCapAdjTrnPubBcastT, *pExtCapAdjTrnPubBcastT;

#endif  /* _EXT_CAP_ADJ_TRN_PUB_BCAST_T_ */

/******************************************************************************/

#ifndef _CAP_ADJ_TRN_PUB_BCAST_T_
#define _CAP_ADJ_TRN_PUB_BCAST_T_

typedef struct capAdjTrnPubBcastTag
{
    bscSeqNoT        seqNo;
    dataHeaderT      header;
    extCapAdjTrnPubBcastT extension;
} capAdjTrnPubBcastT, *pCapAdjTrnPubBcastT;

#endif  /* _CAP_ADJ_TRN_PUB_BCAST_T_ */

/******************************************************************************/

#ifndef _EXT_CNTR_CHG_TRN_PUB_BCAST_T_
#define _EXT_CNTR_CHG_TRN_PUB_BCAST_T_

typedef struct extCntrChgTrnPubBcastTag
{
    char             boiTrnTyp       [BOI_TRN_TYP_LEN];
    char             cntrChgTrnTyp;
    char             currTypCod      [CURR_TYP_COD_LEN];
    char             dcmlShft;
    char             isinCod         [ISIN_COD_LEN];
    char             cntrExpDat      [DRIV_DATE_LEN];
    char             cntrGenNo;
    char             prodId          [PROD_ID_LEN];
    char             cntrClasCod;
    char             cntrExpMthDat   [CNTR_EXP_MTH_DAT_LEN];
    char             cntrExerPrc     [CNTR_EXER_PRC_LEN];
    char             cntrVersNo;
    char             cntrSiz         [CNTR_SIZ_LEN];
    char             prodIdNew       [PROD_ID_NEW_LEN];
    char             cntrClasCodNew;
    char             cntrExpMthDatNew [CNTR_EXP_MTH_DAT_NEW_LEN];
    char             cntrExpYrDatNew [CNTR_EXP_YR_DAT_NEW_LEN];
    char             cntrExerPrcNew  [CNTR_EXER_PRC_NEW_LEN];
    char             cntrVersNoNew;
    char             cntrSizNew      [CNTR_SIZ_NEW_LEN];
    char             cshValDat       [DRIV_DATE_LEN];
    char             secuValDat      [DRIV_DATE_LEN];
    char             autManExerTyp;
    char             exerStylTyp;
    char             mgnStylTyp;
    char             exerPrcDcml;
} extCntrChgTrnPubBcastT, *pExtCntrChgTrnPubBcastT;

#endif  /* _EXT_CNTR_CHG_TRN_PUB_BCAST_T_ */

/******************************************************************************/

#ifndef _CNTR_CHG_TRN_PUB_BCAST_T_
#define _CNTR_CHG_TRN_PUB_BCAST_T_

typedef struct cntrChgTrnPubBcastTag
{
    bscSeqNoT        seqNo;
    dataHeaderT      header;
    extCntrChgTrnPubBcastT extension;
} cntrChgTrnPubBcastT, *pCntrChgTrnPubBcastT;

#endif  /* _CNTR_CHG_TRN_PUB_BCAST_T_ */

/******************************************************************************/

#ifndef _EXT_EXCH_RAT_TRN_PUB_BCAST_T_
#define _EXT_EXCH_RAT_TRN_PUB_BCAST_T_

typedef struct extExchRatTrnPubBcastTag
{
    char             boiTrnTyp       [BOI_TRN_TYP_LEN];
    char             noOfExchRat     [NO_OF_EXCH_RAT_LEN];
    extExchRatTrnRecT extExchRatTrnRec [EXT_EXCH_RAT_TRN_REC_MAX];
} extExchRatTrnPubBcastT, *pExtExchRatTrnPubBcastT;

#endif  /* _EXT_EXCH_RAT_TRN_PUB_BCAST_T_ */

/******************************************************************************/

#ifndef _EXCH_RAT_TRN_PUB_BCAST_T_
#define _EXCH_RAT_TRN_PUB_BCAST_T_

typedef struct exchRatTrnPubBcastTag
{
    bscSeqNoT        seqNo;
    dataHeaderT      header;
    extExchRatTrnPubBcastT extension;
} exchRatTrnPubBcastT, *pExchRatTrnPubBcastT;

#endif  /* _EXCH_RAT_TRN_PUB_BCAST_T_ */

/******************************************************************************/

#ifndef _EXT_IDAY_CNTR_TRN_PUB_BCAST_T_
#define _EXT_IDAY_CNTR_TRN_PUB_BCAST_T_

typedef struct extIdayCntrTrnPubBcastTag
{
    char             boiTrnTyp       [BOI_TRN_TYP_LEN];
    char             primExchIdCod   [PRIM_EXCH_ID_COD_LEN];
    optCntrIdGrpT    optCntrIdGrp;
    char             currTypCod      [CURR_TYP_COD_LEN];
    char             trdUntNo        [TRD_UNT_NO_LEN];
    char             strkPrcMult     [STRK_PRC_MULT_LEN];
    char             cntrExpDat      [DRIV_DATE_LEN];
    char             cntrStsCod;
    char             cntrAsynInd;
    char             lepoInd;
    occCntrIdGrpT    occCntrIdGrp;
} extIdayCntrTrnPubBcastT, *pExtIdayCntrTrnPubBcastT;

#endif  /* _EXT_IDAY_CNTR_TRN_PUB_BCAST_T_ */

/******************************************************************************/

#ifndef _IDAY_CNTR_TRN_PUB_BCAST_T_
#define _IDAY_CNTR_TRN_PUB_BCAST_T_

typedef struct idayCntrTrnPubBcastTag
{
    bscSeqNoT        seqNo;
    dataHeaderT      header;
    extIdayCntrTrnPubBcastT extension;
} idayCntrTrnPubBcastT, *pIdayCntrTrnPubBcastT;

#endif  /* _IDAY_CNTR_TRN_PUB_BCAST_T_ */

/******************************************************************************/

#ifndef _EXT_PROD_CHG_TRN_PUB_BCAST_T_
#define _EXT_PROD_CHG_TRN_PUB_BCAST_T_

typedef struct extProdChgTrnPubBcastTag
{
    char             boiTrnTyp       [BOI_TRN_TYP_LEN];
    char             prodChgTrnTyp   [PROD_CHG_TRN_TYP_LEN];
    char             prodId          [PROD_ID_LEN];
    char             isinCod         [ISIN_COD_LEN];
    char             exerPrcDcmlOld;
    char             exerPrcDcmlNew;
} extProdChgTrnPubBcastT, *pExtProdChgTrnPubBcastT;

#endif  /* _EXT_PROD_CHG_TRN_PUB_BCAST_T_ */

/******************************************************************************/

#ifndef _PROD_CHG_TRN_PUB_BCAST_T_
#define _PROD_CHG_TRN_PUB_BCAST_T_

typedef struct prodChgTrnPubBcastTag
{
    bscSeqNoT        seqNo;
    dataHeaderT      header;
    extProdChgTrnPubBcastT extension;
} prodChgTrnPubBcastT, *pProdChgTrnPubBcastT;

#endif  /* _PROD_CHG_TRN_PUB_BCAST_T_ */

/******************************************************************************/

#ifndef _EXT_SETL_PRC_TRN_PUB_BCAST_T_
#define _EXT_SETL_PRC_TRN_PUB_BCAST_T_

typedef struct extSetlPrcTrnPubBcastTag
{
    char             boiTrnTyp       [BOI_TRN_TYP_LEN];
    char             noOfSetlPrc     [NO_OF_SETL_PRC_LEN];
    extSetlPrcTrnRecT extSetlPrcTrnRec [EXT_SETL_PRC_TRN_REC_MAX];
} extSetlPrcTrnPubBcastT, *pExtSetlPrcTrnPubBcastT;

#endif  /* _EXT_SETL_PRC_TRN_PUB_BCAST_T_ */

/******************************************************************************/

#ifndef _SETL_PRC_TRN_PUB_BCAST_T_
#define _SETL_PRC_TRN_PUB_BCAST_T_

typedef struct setlPrcTrnPubBcastTag
{
    bscSeqNoT        seqNo;
    dataHeaderT      header;
    extSetlPrcTrnPubBcastT extension;
} setlPrcTrnPubBcastT, *pSetlPrcTrnPubBcastT;

#endif  /* _SETL_PRC_TRN_PUB_BCAST_T_ */

/******************************************************************************/

#ifndef _EXT_STS_MSG_TRN_PUB_BCAST_T_
#define _EXT_STS_MSG_TRN_PUB_BCAST_T_

typedef struct extStsMsgTrnPubBcastTag
{
    char             boiTrnTyp       [BOI_TRN_TYP_LEN];
    char             exchIdCod       [DRIV_EXCH_ID_COD_LEN];
    char             sts             [STS_LEN];
    char             stsProdId       [STS_PROD_ID_LEN];
} extStsMsgTrnPubBcastT, *pExtStsMsgTrnPubBcastT;

#endif  /* _EXT_STS_MSG_TRN_PUB_BCAST_T_ */

/******************************************************************************/

#ifndef _STS_MSG_TRN_PUB_BCAST_T_
#define _STS_MSG_TRN_PUB_BCAST_T_

typedef struct stsMsgTrnPubBcastTag
{
    bscSeqNoT        seqNo;
    dataHeaderT      header;
    extStsMsgTrnPubBcastT extension;
} stsMsgTrnPubBcastT, *pStsMsgTrnPubBcastT;

#endif  /* _STS_MSG_TRN_PUB_BCAST_T_ */

/******************************************************************************/

#ifndef _BSC_SUB_B_O_INFO_SUBJECT_T_
#define _BSC_SUB_B_O_INFO_SUBJECT_T_

typedef struct bscSubBOInfoSubjectTag
{
    char             boiTrnTyp       [BOI_TRN_TYP_LEN];
} bscSubBOInfoSubjectT, *pBscSubBOInfoSubjectT;

#endif  /* _BSC_SUB_B_O_INFO_SUBJECT_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _SUBBOINFO_HXX_ */

/******************************************************************************/
/* End of file SubBOInfo.hxx */
/******************************************************************************/
