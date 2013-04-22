/* Generated by Xgen from: E100.05.02 SIR 82796 on: 2007-06-12 15:43 */
/*******************************************************************************
* 2007 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   AdjFlxCntrTrd.hxx
*
*  DESCRIPTION: Layouts used for
*               Adjust Flexible Contract Trade
*
*******************************************************************************/

#ifndef _ADJFLXCNTRTRD_HXX_
#define _ADJFLXCNTRTRD_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _BSC_ADJ_FLX_CNTR_TRD_REQUEST_T_
#define _BSC_ADJ_FLX_CNTR_TRD_REQUEST_T_

typedef struct bscAdjFlxCntrTrdRequestTag
{
    flxCntrTrnIdGrpT flxCntrTrnIdGrp;
    char             buyCod;
    char             prodId          [PROD_ID_LEN];
    trdrIdGrpT       trdrIdGrp;
    char             abdnInd;
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} bscAdjFlxCntrTrdRequestT, *pBscAdjFlxCntrTrdRequestT;

#endif  /* _BSC_ADJ_FLX_CNTR_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _EXT_ADJ_FLX_CNTR_TRD_REQUEST_T_
#define _EXT_ADJ_FLX_CNTR_TRD_REQUEST_T_

typedef struct extAdjFlxCntrTrdRequestTag
{
    acctTypCodGrpT   acctTypCodGrp;
    txtGrpT          txtGrp;
} extAdjFlxCntrTrdRequestT, *pExtAdjFlxCntrTrdRequestT;

#endif  /* _EXT_ADJ_FLX_CNTR_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _ADJ_FLX_CNTR_TRD_REQUEST_T_
#define _ADJ_FLX_CNTR_TRD_REQUEST_T_

typedef struct adjFlxCntrTrdRequestTag
{
    dataHeaderT      header;
    bscAdjFlxCntrTrdRequestT basic;
    extAdjFlxCntrTrdRequestT extension;
} adjFlxCntrTrdRequestT, *pAdjFlxCntrTrdRequestT;

#endif  /* _ADJ_FLX_CNTR_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_ADJ_FLX_CNTR_TRD_RESPONSE_T_
#define _BSC_ADJ_FLX_CNTR_TRD_RESPONSE_T_

typedef struct bscAdjFlxCntrTrdResponseTag
{
    char             flxCntrSynProdId [PROD_ID_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} bscAdjFlxCntrTrdResponseT, *pBscAdjFlxCntrTrdResponseT;

#endif  /* _BSC_ADJ_FLX_CNTR_TRD_RESPONSE_T_ */

/******************************************************************************/

#ifndef _ADJ_FLX_CNTR_TRD_RESPONSE_T_
#define _ADJ_FLX_CNTR_TRD_RESPONSE_T_

typedef struct adjFlxCntrTrdResponseTag
{
    dataHeaderT      header;
    bscAdjFlxCntrTrdResponseT basic;
} adjFlxCntrTrdResponseT, *pAdjFlxCntrTrdResponseT;

#endif  /* _ADJ_FLX_CNTR_TRD_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _ADJFLXCNTRTRD_HXX_ */

/******************************************************************************/
/* End of file AdjFlxCntrTrd.hxx */
/******************************************************************************/
