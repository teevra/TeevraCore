/* Generated by Xgen from: E130.08.01 SIR 149794 on: 2010-02-12 15:07 */
/*******************************************************************************
* 2010 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqPosn.hxx
*
*  DESCRIPTION: Layouts used for
*               Inquire Position
*
*******************************************************************************/

#ifndef _INQPOSN_HXX_
#define _INQPOSN_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define FUT_BSC_INQ_POSN_GRP_MAX                 98
#define FUT_BSC_INQ_POSN_REC_MAX                 22
#define OPT_BSC_INQ_POSN_GRP_MAX                 98
#define OPT_BSC_INQ_POSN_REC_MAX                 22
#define OPT_EXT_INQ_POSN_REC_MAX                 22

/******************************************************************************/

#ifndef _FUT_BSC_INQ_POSN_REQUEST_T_
#define _FUT_BSC_INQ_POSN_REQUEST_T_

typedef struct futBscInqPosnRequestTag
{
    char             membClgIdCod    [MEMB_CLG_ID_COD_LEN];
    char             membExchIdCod   [MEMB_EXCH_ID_COD_LEN];
    acctTypCodGrpT   acctTypCodGrp;
    futCntrIdGrpT    futCntrIdGrp    [FUT_BSC_INQ_POSN_GRP_MAX];
    char             trnDat          [DRIV_DATE_LEN];
    char             mliCntrDataCtr  [MLI_CNTR_DATA_CTR_LEN];
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
} futBscInqPosnRequestT, *pFutBscInqPosnRequestT;

#endif  /* _FUT_BSC_INQ_POSN_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_INQ_POSN_REQUEST_T_
#define _FUT_INQ_POSN_REQUEST_T_

typedef struct futInqPosnRequestTag
{
    dataHeaderT      header;
    futBscInqPosnRequestT basic;
} futInqPosnRequestT, *pFutInqPosnRequestT;

#endif  /* _FUT_INQ_POSN_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_INQ_POSN_REC_T_
#define _FUT_BSC_INQ_POSN_REC_T_

typedef struct futBscInqPosnRecTag
{
    acctTypCodGrpT   acctTypCodGrp;
    futCntrIdGrpT    futCntrIdGrp;
    char             prvLngQty       [DRIV_QUANTITY_LEN];
    char             prvShtQty       [DRIV_QUANTITY_LEN];
    char             crtLngQty       [DRIV_QUANTITY_LEN];
    char             crtShtQty       [DRIV_QUANTITY_LEN];
    char             notifQty        [DRIV_QUANTITY_LEN];
    char             dsgnOpnLng      [DRIV_QUANTITY_LEN];
    char             dsgnOpnSht      [DRIV_QUANTITY_LEN];
    char             dsgnOpnLngGivUp [DRIV_QUANTITY_LEN];
    char             dsgnOpnShtGivUp [DRIV_QUANTITY_LEN];
    char             dsgnOpnLngPosnTsf [DRIV_QUANTITY_LEN];
    char             dsgnOpnShtPosnTsf [DRIV_QUANTITY_LEN];
    char             totVmarAmnt     [DRIV_AMOUNT_LEN];
    char             totFeeAmnt      [DRIV_AMOUNT_LEN];
} futBscInqPosnRecT, *pFutBscInqPosnRecT;

#endif  /* _FUT_BSC_INQ_POSN_REC_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_INQ_POSN_RESPONSE_T_
#define _FUT_BSC_INQ_POSN_RESPONSE_T_

typedef struct futBscInqPosnResponseTag
{
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    futBscInqPosnRecT futBscInqPosnRec [FUT_BSC_INQ_POSN_REC_MAX];
} futBscInqPosnResponseT, *pFutBscInqPosnResponseT;

#endif  /* _FUT_BSC_INQ_POSN_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_INQ_POSN_RESPONSE_T_
#define _FUT_INQ_POSN_RESPONSE_T_

typedef struct futInqPosnResponseTag
{
    dataHeaderT      header;
    futBscInqPosnResponseT basic;
} futInqPosnResponseT, *pFutInqPosnResponseT;

#endif  /* _FUT_INQ_POSN_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_INQ_POSN_REQUEST_T_
#define _OPT_BSC_INQ_POSN_REQUEST_T_

typedef struct optBscInqPosnRequestTag
{
    char             membClgIdCod    [MEMB_CLG_ID_COD_LEN];
    char             membExchIdCod   [MEMB_EXCH_ID_COD_LEN];
    acctTypCodGrpT   acctTypCodGrp;
    optCntrIdGrpT    optCntrIdGrp    [OPT_BSC_INQ_POSN_GRP_MAX];
    char             trnDat          [DRIV_DATE_LEN];
    char             mliCntrDataCtr  [MLI_CNTR_DATA_CTR_LEN];
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
} optBscInqPosnRequestT, *pOptBscInqPosnRequestT;

#endif  /* _OPT_BSC_INQ_POSN_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_INQ_POSN_REQUEST_T_
#define _OPT_INQ_POSN_REQUEST_T_

typedef struct optInqPosnRequestTag
{
    dataHeaderT      header;
    optBscInqPosnRequestT basic;
} optInqPosnRequestT, *pOptInqPosnRequestT;

#endif  /* _OPT_INQ_POSN_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_INQ_POSN_REC_T_
#define _OPT_BSC_INQ_POSN_REC_T_

typedef struct optBscInqPosnRecTag
{
    acctTypCodGrpT   acctTypCodGrp;
    optCntrIdGrpT    optCntrIdGrp;
    char             prvLngQty       [DRIV_QUANTITY_LEN];
    char             prvShtQty       [DRIV_QUANTITY_LEN];
    char             crtLngQty       [DRIV_QUANTITY_LEN];
    char             crtShtQty       [DRIV_QUANTITY_LEN];
    char             exerQty         [DRIV_QUANTITY_LEN];
    char             dsgnOpnLng      [DRIV_QUANTITY_LEN];
    char             dsgnOpnSht      [DRIV_QUANTITY_LEN];
    char             dsgnOpnLngGivUp [DRIV_QUANTITY_LEN];
    char             dsgnOpnShtGivUp [DRIV_QUANTITY_LEN];
    char             dsgnOpnLngPosnTsf [DRIV_QUANTITY_LEN];
    char             dsgnOpnShtPosnTsf [DRIV_QUANTITY_LEN];
    char             totPrmAmnt      [DRIV_AMOUNT_LEN];
    char             totFeeAmnt      [DRIV_AMOUNT_LEN];
} optBscInqPosnRecT, *pOptBscInqPosnRecT;

#endif  /* _OPT_BSC_INQ_POSN_REC_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_INQ_POSN_RESPONSE_T_
#define _OPT_BSC_INQ_POSN_RESPONSE_T_

typedef struct optBscInqPosnResponseTag
{
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    optBscInqPosnRecT optBscInqPosnRec [OPT_BSC_INQ_POSN_REC_MAX];
} optBscInqPosnResponseT, *pOptBscInqPosnResponseT;

#endif  /* _OPT_BSC_INQ_POSN_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_EXT_INQ_POSN_REC_T_
#define _OPT_EXT_INQ_POSN_REC_T_

typedef struct optExtInqPosnRecTag
{
    char             abdnQty         [DRIV_QUANTITY_LEN];
} optExtInqPosnRecT, *pOptExtInqPosnRecT;

#endif  /* _OPT_EXT_INQ_POSN_REC_T_ */

/******************************************************************************/

#ifndef _OPT_EXT_INQ_POSN_RESPONSE_T_
#define _OPT_EXT_INQ_POSN_RESPONSE_T_

typedef struct optExtInqPosnResponseTag
{
    optExtInqPosnRecT optExtInqPosnRec [OPT_EXT_INQ_POSN_REC_MAX];
} optExtInqPosnResponseT, *pOptExtInqPosnResponseT;

#endif  /* _OPT_EXT_INQ_POSN_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_INQ_POSN_RESPONSE_T_
#define _OPT_INQ_POSN_RESPONSE_T_

typedef struct optInqPosnResponseTag
{
    dataHeaderT      header;
    optBscInqPosnResponseT basic;
    optExtInqPosnResponseT extension;
} optInqPosnResponseT, *pOptInqPosnResponseT;

#endif  /* _OPT_INQ_POSN_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQPOSN_HXX_ */

/******************************************************************************/
/* End of file InqPosn.hxx */
/******************************************************************************/
