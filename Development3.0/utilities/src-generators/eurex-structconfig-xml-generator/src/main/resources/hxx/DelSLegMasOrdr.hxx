/* Generated by Xgen from: E110.03.08 SIR 103290 on: 2008-04-02 14:05 */
/*******************************************************************************
* 2008 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   DelSLegMasOrdr.hxx
*
*  DESCRIPTION: Layouts used for
*               Delete Single Leg Mass Order
*
*******************************************************************************/

#ifndef _DELSLEGMASORDR_HXX_
#define _DELSLEGMASORDR_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define FUT_BSC_DEL_S_LEG_MAS_ORDR_GRP_MAX       12
#define FUT_BSC_DEL_S_LEG_MAS_ORDR_REC_MAX       12
#define OPT_BSC_DEL_S_LEG_MAS_ORDR_GRP_MAX       12
#define OPT_BSC_DEL_S_LEG_MAS_ORDR_REC_MAX       12

/******************************************************************************/

#ifndef _FUT_BSC_DEL_S_LEG_MAS_ORDR_GRP_T_
#define _FUT_BSC_DEL_S_LEG_MAS_ORDR_GRP_T_

typedef struct futBscDelSLegMasOrdrGrpTag
{
    char             buyCod;
    futCntrIdGrpT    futCntrIdGrp;
    trdrIdGrpT       trdrIdGrp;
    char             ordrNo          [DRIV_ORDR_NO_LEN];
    char             ordrTypCod;
    char             userOrdrRef     [USER_ORDR_REF_LEN];
} futBscDelSLegMasOrdrGrpT, *pFutBscDelSLegMasOrdrGrpT;

#endif  /* _FUT_BSC_DEL_S_LEG_MAS_ORDR_GRP_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_DEL_S_LEG_MAS_ORDR_REQUEST_T_
#define _FUT_BSC_DEL_S_LEG_MAS_ORDR_REQUEST_T_

typedef struct futBscDelSLegMasOrdrRequestTag
{
    char             mliCntrDataCtr  [MLI_CNTR_DATA_CTR_LEN];
    futBscDelSLegMasOrdrGrpT futBscDelSLegMasOrdrGrp [FUT_BSC_DEL_S_LEG_MAS_ORDR_GRP_MAX];
} futBscDelSLegMasOrdrRequestT, *pFutBscDelSLegMasOrdrRequestT;

#endif  /* _FUT_BSC_DEL_S_LEG_MAS_ORDR_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_DEL_S_LEG_MAS_ORDR_REQUEST_T_
#define _FUT_DEL_S_LEG_MAS_ORDR_REQUEST_T_

typedef struct futDelSLegMasOrdrRequestTag
{
    dataHeaderT      header;
    futBscDelSLegMasOrdrRequestT basic;
} futDelSLegMasOrdrRequestT, *pFutDelSLegMasOrdrRequestT;

#endif  /* _FUT_DEL_S_LEG_MAS_ORDR_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_DEL_S_LEG_MAS_ORDR_REC_T_
#define _FUT_BSC_DEL_S_LEG_MAS_ORDR_REC_T_

typedef struct futBscDelSLegMasOrdrRecTag
{
    char             rtnCod          [RTN_COD_LEN];
    char             lstEvntTrnId    [LST_EVNT_TRN_ID_LEN];
} futBscDelSLegMasOrdrRecT, *pFutBscDelSLegMasOrdrRecT;

#endif  /* _FUT_BSC_DEL_S_LEG_MAS_ORDR_REC_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_DEL_S_LEG_MAS_ORDR_RESPONSE_T_
#define _FUT_BSC_DEL_S_LEG_MAS_ORDR_RESPONSE_T_

typedef struct futBscDelSLegMasOrdrResponseTag
{
    char             ordrResCod;
    char             lstEvntDat      [DRIV_DATE_LEN];
    char             lstEvntTim      [DRIV_TIME_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    futBscDelSLegMasOrdrRecT futBscDelSLegMasOrdrRec [FUT_BSC_DEL_S_LEG_MAS_ORDR_REC_MAX];
} futBscDelSLegMasOrdrResponseT, *pFutBscDelSLegMasOrdrResponseT;

#endif  /* _FUT_BSC_DEL_S_LEG_MAS_ORDR_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_DEL_S_LEG_MAS_ORDR_RESPONSE_T_
#define _FUT_DEL_S_LEG_MAS_ORDR_RESPONSE_T_

typedef struct futDelSLegMasOrdrResponseTag
{
    dataHeaderT      header;
    futBscDelSLegMasOrdrResponseT basic;
} futDelSLegMasOrdrResponseT, *pFutDelSLegMasOrdrResponseT;

#endif  /* _FUT_DEL_S_LEG_MAS_ORDR_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_DEL_S_LEG_MAS_ORDR_GRP_T_
#define _OPT_BSC_DEL_S_LEG_MAS_ORDR_GRP_T_

typedef struct optBscDelSLegMasOrdrGrpTag
{
    char             buyCod;
    optCntrIdGrpT    optCntrIdGrp;
    trdrIdGrpT       trdrIdGrp;
    char             ordrNo          [DRIV_ORDR_NO_LEN];
    char             ordrTypCod;
    char             userOrdrRef     [USER_ORDR_REF_LEN];
} optBscDelSLegMasOrdrGrpT, *pOptBscDelSLegMasOrdrGrpT;

#endif  /* _OPT_BSC_DEL_S_LEG_MAS_ORDR_GRP_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_DEL_S_LEG_MAS_ORDR_REQUEST_T_
#define _OPT_BSC_DEL_S_LEG_MAS_ORDR_REQUEST_T_

typedef struct optBscDelSLegMasOrdrRequestTag
{
    char             mliCntrDataCtr  [MLI_CNTR_DATA_CTR_LEN];
    optBscDelSLegMasOrdrGrpT optBscDelSLegMasOrdrGrp [OPT_BSC_DEL_S_LEG_MAS_ORDR_GRP_MAX];
} optBscDelSLegMasOrdrRequestT, *pOptBscDelSLegMasOrdrRequestT;

#endif  /* _OPT_BSC_DEL_S_LEG_MAS_ORDR_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_DEL_S_LEG_MAS_ORDR_REQUEST_T_
#define _OPT_DEL_S_LEG_MAS_ORDR_REQUEST_T_

typedef struct optDelSLegMasOrdrRequestTag
{
    dataHeaderT      header;
    optBscDelSLegMasOrdrRequestT basic;
} optDelSLegMasOrdrRequestT, *pOptDelSLegMasOrdrRequestT;

#endif  /* _OPT_DEL_S_LEG_MAS_ORDR_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_DEL_S_LEG_MAS_ORDR_REC_T_
#define _OPT_BSC_DEL_S_LEG_MAS_ORDR_REC_T_

typedef struct optBscDelSLegMasOrdrRecTag
{
    char             rtnCod          [RTN_COD_LEN];
    char             lstEvntTrnId    [LST_EVNT_TRN_ID_LEN];
} optBscDelSLegMasOrdrRecT, *pOptBscDelSLegMasOrdrRecT;

#endif  /* _OPT_BSC_DEL_S_LEG_MAS_ORDR_REC_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_DEL_S_LEG_MAS_ORDR_RESPONSE_T_
#define _OPT_BSC_DEL_S_LEG_MAS_ORDR_RESPONSE_T_

typedef struct optBscDelSLegMasOrdrResponseTag
{
    char             lstEvntDat      [DRIV_DATE_LEN];
    char             lstEvntTim      [DRIV_TIME_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    optBscDelSLegMasOrdrRecT optBscDelSLegMasOrdrRec [OPT_BSC_DEL_S_LEG_MAS_ORDR_REC_MAX];
} optBscDelSLegMasOrdrResponseT, *pOptBscDelSLegMasOrdrResponseT;

#endif  /* _OPT_BSC_DEL_S_LEG_MAS_ORDR_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_DEL_S_LEG_MAS_ORDR_RESPONSE_T_
#define _OPT_DEL_S_LEG_MAS_ORDR_RESPONSE_T_

typedef struct optDelSLegMasOrdrResponseTag
{
    dataHeaderT      header;
    optBscDelSLegMasOrdrResponseT basic;
} optDelSLegMasOrdrResponseT, *pOptDelSLegMasOrdrResponseT;

#endif  /* _OPT_DEL_S_LEG_MAS_ORDR_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _DELSLEGMASORDR_HXX_ */

/******************************************************************************/
/* End of file DelSLegMasOrdr.hxx */
/******************************************************************************/