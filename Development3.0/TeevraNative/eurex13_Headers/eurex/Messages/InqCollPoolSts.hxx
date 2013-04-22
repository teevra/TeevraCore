/* Generated by Xgen from: E130.18.01 SIR 152405 on: 2010-03-30 15:12 */
/*******************************************************************************
* 2010 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqCollPoolSts.hxx
*
*  DESCRIPTION: Layouts used for
*               Inquire Collateral Pool Status
*
*******************************************************************************/

#ifndef _INQCOLLPOOLSTS_HXX_
#define _INQCOLLPOOLSTS_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define BSC_INQ_COLL_POOL_STS_REC_MAX            18

/******************************************************************************/

#ifndef _BSC_INQ_COLL_POOL_STS_REQUEST_T_
#define _BSC_INQ_COLL_POOL_STS_REQUEST_T_

typedef struct bscInqCollPoolStsRequestTag
{
    char             membClgIdCod    [MEMB_CLG_ID_COD_LEN];
    char             collPoolOwnrId  [DRIV_COLL_POOL_OWNR_ID_LEN];
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
} bscInqCollPoolStsRequestT, *pBscInqCollPoolStsRequestT;

#endif  /* _BSC_INQ_COLL_POOL_STS_REQUEST_T_ */

/******************************************************************************/

#ifndef _INQ_COLL_POOL_STS_REQUEST_T_
#define _INQ_COLL_POOL_STS_REQUEST_T_

typedef struct inqCollPoolStsRequestTag
{
    dataHeaderT      header;
    bscInqCollPoolStsRequestT basic;
} inqCollPoolStsRequestT, *pInqCollPoolStsRequestT;

#endif  /* _INQ_COLL_POOL_STS_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_COLL_POOL_STS_REC_T_
#define _BSC_INQ_COLL_POOL_STS_REC_T_

typedef struct bscInqCollPoolStsRecTag
{
    char             collPoolId      [DRIV_COLL_POOL_ID_LEN];
    char             membClgIdCod    [MEMB_CLG_ID_COD_LEN];
    char             clgMembCurrTypCod [DRIV_CLG_MEMB_CURR_TYP_COD_LEN];
    char             collPoolOwnrId  [DRIV_COLL_POOL_OWNR_ID_LEN];
    char             collPoolTyp;
    char             asstPurpCod;
    char             collPoolStsDat  [DRIV_DATE_LEN];
    char             collPoolStsTim  [DRIV_TIME_LEN];
    char             valUnknownInd;
    char             collPoolStrtOfDayAmnt [DRIV_AMOUNT_LEN];
    char             collPoolCurrBalAmnt [DRIV_AMOUNT_LEN];
    char             collPoolMinAmnt [DRIV_AMOUNT_LEN];
    char             varPrmPrednAmnt [DRIV_AMOUNT_LEN];
    char             shtfallSrplAmnt [DRIV_AMOUNT_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} bscInqCollPoolStsRecT, *pBscInqCollPoolStsRecT;

#endif  /* _BSC_INQ_COLL_POOL_STS_REC_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_COLL_POOL_STS_RESPONSE_T_
#define _BSC_INQ_COLL_POOL_STS_RESPONSE_T_

typedef struct bscInqCollPoolStsResponseTag
{
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    bscInqCollPoolStsRecT bscInqCollPoolStsRec [BSC_INQ_COLL_POOL_STS_REC_MAX];
} bscInqCollPoolStsResponseT, *pBscInqCollPoolStsResponseT;

#endif  /* _BSC_INQ_COLL_POOL_STS_RESPONSE_T_ */

/******************************************************************************/

#ifndef _INQ_COLL_POOL_STS_RESPONSE_T_
#define _INQ_COLL_POOL_STS_RESPONSE_T_

typedef struct inqCollPoolStsResponseTag
{
    dataHeaderT      header;
    bscInqCollPoolStsResponseT basic;
} inqCollPoolStsResponseT, *pInqCollPoolStsResponseT;

#endif  /* _INQ_COLL_POOL_STS_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQCOLLPOOLSTS_HXX_ */

/******************************************************************************/
/* End of file InqCollPoolSts.hxx */
/******************************************************************************/
