/* Generated by Xgen from: E120.27.02 SIR 134649 on: 2009-06-30 17:11 */
/*******************************************************************************
* 2009 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqPosnDetl.hxx
*
*  DESCRIPTION: Layouts used for
*               Inquire Position Detail
*
*******************************************************************************/

#ifndef _INQPOSNDETL_HXX_
#define _INQPOSNDETL_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define FUT_BSC_INQ_POSN_DETL_REC_MAX            6
#define FUT_EXT_INQ_POSN_DETL_REC_MAX            6
#define OPT_BSC_INQ_POSN_DETL_REC_MAX            6
#define OPT_EXT_INQ_POSN_DETL_REC_MAX            6

/******************************************************************************/

#ifndef _FUT_BSC_INQ_POSN_DETL_REQUEST_T_
#define _FUT_BSC_INQ_POSN_DETL_REQUEST_T_

typedef struct futBscInqPosnDetlRequestTag
{
    char             membClgIdCod    [MEMB_CLG_ID_COD_LEN];
    char             membExchIdCod   [MEMB_EXCH_ID_COD_LEN];
    char             trnDat          [DRIV_DATE_LEN];
    acctTypCodGrpT   acctTypCodGrp;
    futCntrIdGrpT    futCntrIdGrp;
    char             posTrnTyp       [POS_TRN_TYP_LEN];
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
} futBscInqPosnDetlRequestT, *pFutBscInqPosnDetlRequestT;

#endif  /* _FUT_BSC_INQ_POSN_DETL_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_EXT_INQ_POSN_DETL_REQUEST_T_
#define _FUT_EXT_INQ_POSN_DETL_REQUEST_T_

typedef struct futExtInqPosnDetlRequestTag
{
    txtGrpT          txtGrp;
    origTrnFiltGrpT  origTrnFiltGrp;
} futExtInqPosnDetlRequestT, *pFutExtInqPosnDetlRequestT;

#endif  /* _FUT_EXT_INQ_POSN_DETL_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_INQ_POSN_DETL_REQUEST_T_
#define _FUT_INQ_POSN_DETL_REQUEST_T_

typedef struct futInqPosnDetlRequestTag
{
    dataHeaderT      header;
    futBscInqPosnDetlRequestT basic;
    futExtInqPosnDetlRequestT extension;
} futInqPosnDetlRequestT, *pFutInqPosnDetlRequestT;

#endif  /* _FUT_INQ_POSN_DETL_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_INQ_POSN_DETL_REC_T_
#define _FUT_BSC_INQ_POSN_DETL_REC_T_

typedef struct futBscInqPosnDetlRecTag
{
    acctTypCodGrpT   acctTypCodGrp;
    char             ordrNo          [DRIV_ORDR_NO_LEN];
    char             trnIdNo         [TRN_ID_NO_LEN];
    trnIdSfxGrpT     trnIdSfxGrp;
    char             posTrnTyp       [POS_TRN_TYP_LEN];
    char             prvLngQty       [DRIV_QUANTITY_LEN];
    char             prvShtQty       [DRIV_QUANTITY_LEN];
    char             crtLngQty       [DRIV_QUANTITY_LEN];
    char             crtShtQty       [DRIV_QUANTITY_LEN];
    char             trnTim          [DRIV_TIME_LEN];
    char             partSubGrpCod   [PART_SUB_GRP_COD_LEN];
    char             partNo          [PART_NO_LEN];
    char             buyCod;
    char             opnClsCod;
    char             gutSts;
    char             lngQty          [DRIV_VOLUME_LEN];
    char             shtQty          [DRIV_VOLUME_LEN];
    char             trdMtchPrc      [DRIV_PRICE_LEN];
    char             trnVmarAmnt     [DRIV_QUANTITY_LEN];
    char             trnFeeAmnt      [DRIV_AMOUNT_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} futBscInqPosnDetlRecT, *pFutBscInqPosnDetlRecT;

#endif  /* _FUT_BSC_INQ_POSN_DETL_REC_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_INQ_POSN_DETL_RESPONSE_T_
#define _FUT_BSC_INQ_POSN_DETL_RESPONSE_T_

typedef struct futBscInqPosnDetlResponseTag
{
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    futBscInqPosnDetlRecT futBscInqPosnDetlRec [FUT_BSC_INQ_POSN_DETL_REC_MAX];
} futBscInqPosnDetlResponseT, *pFutBscInqPosnDetlResponseT;

#endif  /* _FUT_BSC_INQ_POSN_DETL_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_EXT_INQ_POSN_DETL_REC_T_
#define _FUT_EXT_INQ_POSN_DETL_REC_T_

typedef struct futExtInqPosnDetlRecTag
{
    char             trdTyp;
    txtGrpT          txtGrp;
    origTrnGrpT      origTrnGrp;
} futExtInqPosnDetlRecT, *pFutExtInqPosnDetlRecT;

#endif  /* _FUT_EXT_INQ_POSN_DETL_REC_T_ */

/******************************************************************************/

#ifndef _FUT_EXT_INQ_POSN_DETL_RESPONSE_T_
#define _FUT_EXT_INQ_POSN_DETL_RESPONSE_T_

typedef struct futExtInqPosnDetlResponseTag
{
    futExtInqPosnDetlRecT futExtInqPosnDetlRec [FUT_EXT_INQ_POSN_DETL_REC_MAX];
} futExtInqPosnDetlResponseT, *pFutExtInqPosnDetlResponseT;

#endif  /* _FUT_EXT_INQ_POSN_DETL_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_INQ_POSN_DETL_RESPONSE_T_
#define _FUT_INQ_POSN_DETL_RESPONSE_T_

typedef struct futInqPosnDetlResponseTag
{
    dataHeaderT      header;
    futBscInqPosnDetlResponseT basic;
    futExtInqPosnDetlResponseT extension;
} futInqPosnDetlResponseT, *pFutInqPosnDetlResponseT;

#endif  /* _FUT_INQ_POSN_DETL_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_INQ_POSN_DETL_REQUEST_T_
#define _OPT_BSC_INQ_POSN_DETL_REQUEST_T_

typedef struct optBscInqPosnDetlRequestTag
{
    char             membClgIdCod    [MEMB_CLG_ID_COD_LEN];
    char             membExchIdCod   [MEMB_EXCH_ID_COD_LEN];
    char             trnDat          [DRIV_DATE_LEN];
    acctTypCodGrpT   acctTypCodGrp;
    optCntrIdGrpT    optCntrIdGrp;
    char             posTrnTyp       [POS_TRN_TYP_LEN];
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
} optBscInqPosnDetlRequestT, *pOptBscInqPosnDetlRequestT;

#endif  /* _OPT_BSC_INQ_POSN_DETL_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_EXT_INQ_POSN_DETL_REQUEST_T_
#define _OPT_EXT_INQ_POSN_DETL_REQUEST_T_

typedef struct optExtInqPosnDetlRequestTag
{
    txtGrpT          txtGrp;
    origTrnFiltGrpT  origTrnFiltGrp;
} optExtInqPosnDetlRequestT, *pOptExtInqPosnDetlRequestT;

#endif  /* _OPT_EXT_INQ_POSN_DETL_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_INQ_POSN_DETL_REQUEST_T_
#define _OPT_INQ_POSN_DETL_REQUEST_T_

typedef struct optInqPosnDetlRequestTag
{
    dataHeaderT      header;
    optBscInqPosnDetlRequestT basic;
    optExtInqPosnDetlRequestT extension;
} optInqPosnDetlRequestT, *pOptInqPosnDetlRequestT;

#endif  /* _OPT_INQ_POSN_DETL_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_INQ_POSN_DETL_REC_T_
#define _OPT_BSC_INQ_POSN_DETL_REC_T_

typedef struct optBscInqPosnDetlRecTag
{
    acctTypCodGrpT   acctTypCodGrp;
    char             ordrNo          [DRIV_ORDR_NO_LEN];
    char             trnIdNo         [TRN_ID_NO_LEN];
    trnIdSfxGrpT     trnIdSfxGrp;
    char             posTrnTyp       [POS_TRN_TYP_LEN];
    char             prvLngQty       [DRIV_QUANTITY_LEN];
    char             prvShtQty       [DRIV_QUANTITY_LEN];
    char             crtLngQty       [DRIV_QUANTITY_LEN];
    char             crtShtQty       [DRIV_QUANTITY_LEN];
    char             trnTim          [DRIV_TIME_LEN];
    char             partSubGrpCod   [PART_SUB_GRP_COD_LEN];
    char             partNo          [PART_NO_LEN];
    char             buyCod;
    char             opnClsCod;
    char             gutSts;
    char             lngQty          [DRIV_VOLUME_LEN];
    char             shtQty          [DRIV_VOLUME_LEN];
    char             trdMtchPrc      [DRIV_PRICE_LEN];
    char             trnPrmAmnt      [DRIV_AMOUNT_LEN];
    char             trnFeeAmnt      [DRIV_AMOUNT_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} optBscInqPosnDetlRecT, *pOptBscInqPosnDetlRecT;

#endif  /* _OPT_BSC_INQ_POSN_DETL_REC_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_INQ_POSN_DETL_RESPONSE_T_
#define _OPT_BSC_INQ_POSN_DETL_RESPONSE_T_

typedef struct optBscInqPosnDetlResponseTag
{
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    optBscInqPosnDetlRecT optBscInqPosnDetlRec [OPT_BSC_INQ_POSN_DETL_REC_MAX];
} optBscInqPosnDetlResponseT, *pOptBscInqPosnDetlResponseT;

#endif  /* _OPT_BSC_INQ_POSN_DETL_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_EXT_INQ_POSN_DETL_REC_T_
#define _OPT_EXT_INQ_POSN_DETL_REC_T_

typedef struct optExtInqPosnDetlRecTag
{
    char             trdTyp;
    txtGrpT          txtGrp;
    origTrnGrpT      origTrnGrp;
} optExtInqPosnDetlRecT, *pOptExtInqPosnDetlRecT;

#endif  /* _OPT_EXT_INQ_POSN_DETL_REC_T_ */

/******************************************************************************/

#ifndef _OPT_EXT_INQ_POSN_DETL_RESPONSE_T_
#define _OPT_EXT_INQ_POSN_DETL_RESPONSE_T_

typedef struct optExtInqPosnDetlResponseTag
{
    optExtInqPosnDetlRecT optExtInqPosnDetlRec [OPT_EXT_INQ_POSN_DETL_REC_MAX];
} optExtInqPosnDetlResponseT, *pOptExtInqPosnDetlResponseT;

#endif  /* _OPT_EXT_INQ_POSN_DETL_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_INQ_POSN_DETL_RESPONSE_T_
#define _OPT_INQ_POSN_DETL_RESPONSE_T_

typedef struct optInqPosnDetlResponseTag
{
    dataHeaderT      header;
    optBscInqPosnDetlResponseT basic;
    optExtInqPosnDetlResponseT extension;
} optInqPosnDetlResponseT, *pOptInqPosnDetlResponseT;

#endif  /* _OPT_INQ_POSN_DETL_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQPOSNDETL_HXX_ */

/******************************************************************************/
/* End of file InqPosnDetl.hxx */
/******************************************************************************/