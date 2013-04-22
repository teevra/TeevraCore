/* Generated by Xgen from: E100.05.02 SIR 82796 on: 2007-06-12 15:43 */
/*******************************************************************************
* 2007 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   EntFlxCntr.hxx
*
*  DESCRIPTION: Layouts used for
*               Enter Flexible Contract
*
*******************************************************************************/

#ifndef _ENTFLXCNTR_HXX_
#define _ENTFLXCNTR_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _BSC_ENT_FLX_FUT_REQUEST_T_
#define _BSC_ENT_FLX_FUT_REQUEST_T_

typedef struct bscEntFlxFutRequestTag
{
    char             buyCod;
    flxFutCntrIdGrpT flxFutCntrIdGrp;
    trdrIdGrpT       trdrIdGrp;
    char             trdXQty         [DRIV_VOLUME_LEN];
    char             trdMtchPrc      [DRIV_PRICE_LEN];
    char             opnClsCod;
    flxCntrTrnIdClsGrpT flxCntrTrnIdClsGrp;
    char             membCtpyIdCod   [MEMB_CTPY_ID_COD_LEN];
} bscEntFlxFutRequestT, *pBscEntFlxFutRequestT;

#endif  /* _BSC_ENT_FLX_FUT_REQUEST_T_ */

/******************************************************************************/

#ifndef _EXT_ENT_FLX_FUT_REQUEST_T_
#define _EXT_ENT_FLX_FUT_REQUEST_T_

typedef struct extEntFlxFutRequestTag
{
    acctTypCodGrpT   acctTypCodGrp;
    txtGrpT          txtGrp;
    char             membExchIdCodTo [DRIV_MEMB_EXCH_ID_COD_TO_LEN];
} extEntFlxFutRequestT, *pExtEntFlxFutRequestT;

#endif  /* _EXT_ENT_FLX_FUT_REQUEST_T_ */

/******************************************************************************/

#ifndef _ENT_FLX_FUT_REQUEST_T_
#define _ENT_FLX_FUT_REQUEST_T_

typedef struct entFlxFutRequestTag
{
    dataHeaderT      header;
    bscEntFlxFutRequestT basic;
    extEntFlxFutRequestT extension;
} entFlxFutRequestT, *pEntFlxFutRequestT;

#endif  /* _ENT_FLX_FUT_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_ENT_FLX_FUT_RESPONSE_T_
#define _BSC_ENT_FLX_FUT_RESPONSE_T_

typedef struct bscEntFlxFutResponseTag
{
    flxCntrTrnIdGrpT flxCntrTrnIdGrp;
    char             flxCntrSynProdId [PROD_ID_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} bscEntFlxFutResponseT, *pBscEntFlxFutResponseT;

#endif  /* _BSC_ENT_FLX_FUT_RESPONSE_T_ */

/******************************************************************************/

#ifndef _ENT_FLX_FUT_RESPONSE_T_
#define _ENT_FLX_FUT_RESPONSE_T_

typedef struct entFlxFutResponseTag
{
    dataHeaderT      header;
    bscEntFlxFutResponseT basic;
} entFlxFutResponseT, *pEntFlxFutResponseT;

#endif  /* _ENT_FLX_FUT_RESPONSE_T_ */

/******************************************************************************/

#ifndef _BSC_ENT_FLX_OPT_REQUEST_T_
#define _BSC_ENT_FLX_OPT_REQUEST_T_

typedef struct bscEntFlxOptRequestTag
{
    char             buyCod;
    flxOptCntrIdGrpT flxOptCntrIdGrp;
    trdrIdGrpT       trdrIdGrp;
    char             trdXQty         [DRIV_VOLUME_LEN];
    char             trdMtchPrc      [DRIV_PRICE_LEN];
    char             opnClsCod;
    flxCntrTrnIdClsGrpT flxCntrTrnIdClsGrp;
    char             membCtpyIdCod   [MEMB_CTPY_ID_COD_LEN];
} bscEntFlxOptRequestT, *pBscEntFlxOptRequestT;

#endif  /* _BSC_ENT_FLX_OPT_REQUEST_T_ */

/******************************************************************************/

#ifndef _EXT_ENT_FLX_OPT_REQUEST_T_
#define _EXT_ENT_FLX_OPT_REQUEST_T_

typedef struct extEntFlxOptRequestTag
{
    acctTypCodGrpT   acctTypCodGrp;
    txtGrpT          txtGrp;
    char             membExchIdCodTo [DRIV_MEMB_EXCH_ID_COD_TO_LEN];
} extEntFlxOptRequestT, *pExtEntFlxOptRequestT;

#endif  /* _EXT_ENT_FLX_OPT_REQUEST_T_ */

/******************************************************************************/

#ifndef _ENT_FLX_OPT_REQUEST_T_
#define _ENT_FLX_OPT_REQUEST_T_

typedef struct entFlxOptRequestTag
{
    dataHeaderT      header;
    bscEntFlxOptRequestT basic;
    extEntFlxOptRequestT extension;
} entFlxOptRequestT, *pEntFlxOptRequestT;

#endif  /* _ENT_FLX_OPT_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_ENT_FLX_OPT_RESPONSE_T_
#define _BSC_ENT_FLX_OPT_RESPONSE_T_

typedef struct bscEntFlxOptResponseTag
{
    flxCntrTrnIdGrpT flxCntrTrnIdGrp;
    char             flxCntrSynProdId [PROD_ID_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} bscEntFlxOptResponseT, *pBscEntFlxOptResponseT;

#endif  /* _BSC_ENT_FLX_OPT_RESPONSE_T_ */

/******************************************************************************/

#ifndef _ENT_FLX_OPT_RESPONSE_T_
#define _ENT_FLX_OPT_RESPONSE_T_

typedef struct entFlxOptResponseTag
{
    dataHeaderT      header;
    bscEntFlxOptResponseT basic;
} entFlxOptResponseT, *pEntFlxOptResponseT;

#endif  /* _ENT_FLX_OPT_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _ENTFLXCNTR_HXX_ */

/******************************************************************************/
/* End of file EntFlxCntr.hxx */
/******************************************************************************/
