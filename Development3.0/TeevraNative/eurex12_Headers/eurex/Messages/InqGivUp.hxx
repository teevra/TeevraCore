/* Generated by Xgen from: E120.27.02 SIR 134649 on: 2009-06-30 17:11 */
/*******************************************************************************
* 2009 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqGivUp.hxx
*
*  DESCRIPTION: Layouts used for
*               Inquire Give-Up
*
*******************************************************************************/

#ifndef _INQGIVUP_HXX_
#define _INQGIVUP_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define FUT_BSC_INQ_GIV_UP_GRP_MAX               112
#define FUT_BSC_INQ_GIV_UP_REC_MAX               7
#define FUT_EXT_INQ_GIV_UP_REC_MAX               7
#define OPT_BSC_INQ_GIV_UP_GRP_MAX               112
#define OPT_BSC_INQ_GIV_UP_REC_MAX               7
#define OPT_EXT_INQ_GIV_UP_REC_MAX               7

/******************************************************************************/

#ifndef _FUT_BSC_INQ_GIV_UP_REQUEST_T_
#define _FUT_BSC_INQ_GIV_UP_REQUEST_T_

typedef struct futBscInqGivUpRequestTag
{
    char             membClgIdCodFrom [DRIV_MEMB_CLG_ID_COD_FROM_LEN];
    char             membExchIdCodFrom [DRIV_MEMB_EXCH_ID_COD_FROM_LEN];
    futCntrIdGrpT    futCntrIdGrp    [FUT_BSC_INQ_GIV_UP_GRP_MAX];
    char             trnDat          [DRIV_DATE_LEN];
    char             ordrNo          [DRIV_ORDR_NO_LEN];
    char             trnIdNo         [TRN_ID_NO_LEN];
    char             gutSts;
    char             mliCntrDataCtr  [MLI_CNTR_DATA_CTR_LEN];
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
} futBscInqGivUpRequestT, *pFutBscInqGivUpRequestT;

#endif  /* _FUT_BSC_INQ_GIV_UP_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_EXT_INQ_GIV_UP_REQUEST_T_
#define _FUT_EXT_INQ_GIV_UP_REQUEST_T_

typedef struct futExtInqGivUpRequestTag
{
    char             trdTyp;
    txtGrpFiltT      txtGrpFilt;
    origTrnFiltGrpT  origTrnFiltGrp;
} futExtInqGivUpRequestT, *pFutExtInqGivUpRequestT;

#endif  /* _FUT_EXT_INQ_GIV_UP_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_INQ_GIV_UP_REQUEST_T_
#define _FUT_INQ_GIV_UP_REQUEST_T_

typedef struct futInqGivUpRequestTag
{
    dataHeaderT      header;
    futBscInqGivUpRequestT basic;
    futExtInqGivUpRequestT extension;
} futInqGivUpRequestT, *pFutInqGivUpRequestT;

#endif  /* _FUT_INQ_GIV_UP_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_INQ_GIV_UP_REC_T_
#define _FUT_BSC_INQ_GIV_UP_REC_T_

typedef struct futBscInqGivUpRecTag
{
    char             membClgIdCodFrom [DRIV_MEMB_CLG_ID_COD_FROM_LEN];
    char             membExchIdCodFrom [DRIV_MEMB_EXCH_ID_COD_FROM_LEN];
    char             membExchIdCodTo [DRIV_MEMB_EXCH_ID_COD_TO_LEN];
    acctTypCodGrpT   acctTypCodGrp;
    futCntrIdGrpT    futCntrIdGrp;
    char             trnDat          [DRIV_DATE_LEN];
    char             ordrNo          [DRIV_ORDR_NO_LEN];
    char             trnIdNo         [TRN_ID_NO_LEN];
    trnIdSfxGrpT     trnIdSfxGrp;
    char             gutSts;
    char             buyCod;
    char             lngQty          [DRIV_VOLUME_LEN];
    char             shtQty          [DRIV_VOLUME_LEN];
    char             opnClsCod;
    char             trdMtchPrc      [DRIV_PRICE_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} futBscInqGivUpRecT, *pFutBscInqGivUpRecT;

#endif  /* _FUT_BSC_INQ_GIV_UP_REC_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_INQ_GIV_UP_RESPONSE_T_
#define _FUT_BSC_INQ_GIV_UP_RESPONSE_T_

typedef struct futBscInqGivUpResponseTag
{
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    futBscInqGivUpRecT futBscInqGivUpRec [FUT_BSC_INQ_GIV_UP_REC_MAX];
} futBscInqGivUpResponseT, *pFutBscInqGivUpResponseT;

#endif  /* _FUT_BSC_INQ_GIV_UP_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_EXT_INQ_GIV_UP_REC_T_
#define _FUT_EXT_INQ_GIV_UP_REC_T_

typedef struct futExtInqGivUpRecTag
{
    char             trdTyp;
    char             ordrQty         [DRIV_VOLUME_LEN];
    char             ordrExePrc      [DRIV_PRICE_LEN];
    txtGrpFromT      txtGrpFrom;
    txtGrpToT        txtGrpTo;
    origGuTuTrnGrpT  origGuTuTrnGrp;
    trdrIdGrpT       trdrIdGrp;
    char             agrsrMtchInd;
} futExtInqGivUpRecT, *pFutExtInqGivUpRecT;

#endif  /* _FUT_EXT_INQ_GIV_UP_REC_T_ */

/******************************************************************************/

#ifndef _FUT_EXT_INQ_GIV_UP_RESPONSE_T_
#define _FUT_EXT_INQ_GIV_UP_RESPONSE_T_

typedef struct futExtInqGivUpResponseTag
{
    futExtInqGivUpRecT futExtInqGivUpRec [FUT_EXT_INQ_GIV_UP_REC_MAX];
} futExtInqGivUpResponseT, *pFutExtInqGivUpResponseT;

#endif  /* _FUT_EXT_INQ_GIV_UP_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_INQ_GIV_UP_RESPONSE_T_
#define _FUT_INQ_GIV_UP_RESPONSE_T_

typedef struct futInqGivUpResponseTag
{
    dataHeaderT      header;
    futBscInqGivUpResponseT basic;
    futExtInqGivUpResponseT extension;
} futInqGivUpResponseT, *pFutInqGivUpResponseT;

#endif  /* _FUT_INQ_GIV_UP_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_INQ_GIV_UP_REQUEST_T_
#define _OPT_BSC_INQ_GIV_UP_REQUEST_T_

typedef struct optBscInqGivUpRequestTag
{
    char             membClgIdCodFrom [DRIV_MEMB_CLG_ID_COD_FROM_LEN];
    char             membExchIdCodFrom [DRIV_MEMB_EXCH_ID_COD_FROM_LEN];
    optCntrIdGrpT    optCntrIdGrp    [OPT_BSC_INQ_GIV_UP_GRP_MAX];
    char             trnDat          [DRIV_DATE_LEN];
    char             ordrNo          [DRIV_ORDR_NO_LEN];
    char             trnIdNo         [TRN_ID_NO_LEN];
    char             gutSts;
    char             mliCntrDataCtr  [MLI_CNTR_DATA_CTR_LEN];
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
} optBscInqGivUpRequestT, *pOptBscInqGivUpRequestT;

#endif  /* _OPT_BSC_INQ_GIV_UP_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_EXT_INQ_GIV_UP_REQUEST_T_
#define _OPT_EXT_INQ_GIV_UP_REQUEST_T_

typedef struct optExtInqGivUpRequestTag
{
    char             trdTyp;
    txtGrpFiltT      txtGrpFilt;
    origTrnFiltGrpT  origTrnFiltGrp;
} optExtInqGivUpRequestT, *pOptExtInqGivUpRequestT;

#endif  /* _OPT_EXT_INQ_GIV_UP_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_INQ_GIV_UP_REQUEST_T_
#define _OPT_INQ_GIV_UP_REQUEST_T_

typedef struct optInqGivUpRequestTag
{
    dataHeaderT      header;
    optBscInqGivUpRequestT basic;
    optExtInqGivUpRequestT extension;
} optInqGivUpRequestT, *pOptInqGivUpRequestT;

#endif  /* _OPT_INQ_GIV_UP_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_INQ_GIV_UP_REC_T_
#define _OPT_BSC_INQ_GIV_UP_REC_T_

typedef struct optBscInqGivUpRecTag
{
    char             membClgIdCodFrom [DRIV_MEMB_CLG_ID_COD_FROM_LEN];
    char             membExchIdCodFrom [DRIV_MEMB_EXCH_ID_COD_FROM_LEN];
    char             membExchIdCodTo [DRIV_MEMB_EXCH_ID_COD_TO_LEN];
    acctTypCodGrpT   acctTypCodGrp;
    optCntrIdGrpT    optCntrIdGrp;
    char             trnDat          [DRIV_DATE_LEN];
    char             ordrNo          [DRIV_ORDR_NO_LEN];
    char             trnIdNo         [TRN_ID_NO_LEN];
    trnIdSfxGrpT     trnIdSfxGrp;
    char             gutSts;
    char             buyCod;
    char             lngQty          [DRIV_VOLUME_LEN];
    char             shtQty          [DRIV_VOLUME_LEN];
    char             opnClsCod;
    char             trdMtchPrc      [DRIV_PRICE_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} optBscInqGivUpRecT, *pOptBscInqGivUpRecT;

#endif  /* _OPT_BSC_INQ_GIV_UP_REC_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_INQ_GIV_UP_RESPONSE_T_
#define _OPT_BSC_INQ_GIV_UP_RESPONSE_T_

typedef struct optBscInqGivUpResponseTag
{
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    optBscInqGivUpRecT optBscInqGivUpRec [OPT_BSC_INQ_GIV_UP_REC_MAX];
} optBscInqGivUpResponseT, *pOptBscInqGivUpResponseT;

#endif  /* _OPT_BSC_INQ_GIV_UP_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_EXT_INQ_GIV_UP_REC_T_
#define _OPT_EXT_INQ_GIV_UP_REC_T_

typedef struct optExtInqGivUpRecTag
{
    char             trdTyp;
    char             ordrQty         [DRIV_VOLUME_LEN];
    char             ordrExePrc      [DRIV_PRICE_LEN];
    txtGrpFromT      txtGrpFrom;
    txtGrpToT        txtGrpTo;
    origGuTuTrnGrpT  origGuTuTrnGrp;
    trdrIdGrpT       trdrIdGrp;
    char             agrsrMtchInd;
} optExtInqGivUpRecT, *pOptExtInqGivUpRecT;

#endif  /* _OPT_EXT_INQ_GIV_UP_REC_T_ */

/******************************************************************************/

#ifndef _OPT_EXT_INQ_GIV_UP_RESPONSE_T_
#define _OPT_EXT_INQ_GIV_UP_RESPONSE_T_

typedef struct optExtInqGivUpResponseTag
{
    optExtInqGivUpRecT optExtInqGivUpRec [OPT_EXT_INQ_GIV_UP_REC_MAX];
} optExtInqGivUpResponseT, *pOptExtInqGivUpResponseT;

#endif  /* _OPT_EXT_INQ_GIV_UP_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_INQ_GIV_UP_RESPONSE_T_
#define _OPT_INQ_GIV_UP_RESPONSE_T_

typedef struct optInqGivUpResponseTag
{
    dataHeaderT      header;
    optBscInqGivUpResponseT basic;
    optExtInqGivUpResponseT extension;
} optInqGivUpResponseT, *pOptInqGivUpResponseT;

#endif  /* _OPT_INQ_GIV_UP_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQGIVUP_HXX_ */

/******************************************************************************/
/* End of file InqGivUp.hxx */
/******************************************************************************/