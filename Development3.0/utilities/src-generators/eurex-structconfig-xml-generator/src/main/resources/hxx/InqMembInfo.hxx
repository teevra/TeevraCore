/* Generated by Xgen from: E120.12.02 SIR 124053 on: 2009-03-18 17:09 */
/*******************************************************************************
* 2009 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqMembInfo.hxx
*
*  DESCRIPTION: Layouts used for
*               Inquire Member Information
*
*******************************************************************************/

#ifndef _INQMEMBINFO_HXX_
#define _INQMEMBINFO_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define EXT_INQ_MEMB_INFO_CLG_REC_MAX            2
#define EXT_INQ_MEMB_INFO_CSH_REC_MAX            20
#define EXT_INQ_MEMB_INFO_GU_REC_MAX             2

/******************************************************************************/

#ifndef _BSC_INQ_MEMB_INFO_REQUEST_T_
#define _BSC_INQ_MEMB_INFO_REQUEST_T_

typedef struct bscInqMembInfoRequestTag
{
    char             membExchIdCod   [MEMB_EXCH_ID_COD_LEN];
} bscInqMembInfoRequestT, *pBscInqMembInfoRequestT;

#endif  /* _BSC_INQ_MEMB_INFO_REQUEST_T_ */

/******************************************************************************/

#ifndef _INQ_MEMB_INFO_REQUEST_T_
#define _INQ_MEMB_INFO_REQUEST_T_

typedef struct inqMembInfoRequestTag
{
    dataHeaderT      header;
    bscInqMembInfoRequestT basic;
} inqMembInfoRequestT, *pInqMembInfoRequestT;

#endif  /* _INQ_MEMB_INFO_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_MEMB_INFO_RESPONSE_T_
#define _BSC_INQ_MEMB_INFO_RESPONSE_T_

typedef struct bscInqMembInfoResponseTag
{
    char             clgMembCurrTypCod [DRIV_CLG_MEMB_CURR_TYP_COD_LEN];
    char             membExchAffilTypCod;
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
    char             iseTrdAlwdInd;
    char             occClgAlwdInd;
} bscInqMembInfoResponseT, *pBscInqMembInfoResponseT;

#endif  /* _BSC_INQ_MEMB_INFO_RESPONSE_T_ */

/******************************************************************************/

#ifndef _EXT_INQ_MEMB_INFO_RESPONSE_T_
#define _EXT_INQ_MEMB_INFO_RESPONSE_T_

typedef struct extInqMembInfoResponseTag
{
    char             membExchLngNam  [DRIV_MEMB_EXCH_LNG_NAM_LEN];
    char             clgMembTypCod;
    char             membRspDpt      [DRIV_MEMB_RSP_DPT_LEN];
    pstAddGrpT       pstAddGrp;
    char             membAwvCtry     [DRIV_MEMB_AWV_CTRY_LEN];
    clgCtctGrpT      clgCtctGrp      [EXT_INQ_MEMB_INFO_CLG_REC_MAX];
    char             cmpyCapCurrTypCod [DRIV_CMPY_CAP_CURR_TYP_COD_LEN];
    char             cmpyCapDat      [DRIV_DATE_LEN];
    char             cmpyCapAmnt     [DRIV_AMOUNT_LEN];
    char             clgHseTypCod;
    char             minCmpyCap      [DRIV_AMOUNT_LEN];
    char             minMgnColl      [DRIV_AMOUNT_LEN];
    char             minClgFun       [DRIV_AMOUNT_LEN];
    char             withStopCmpyCapInd;
    char             withStopMgnCollInd;
    char             withStopClgFunInd;
    givUpCtctGrpT    givUpCtctGrp    [EXT_INQ_MEMB_INFO_GU_REC_MAX];
    cshLimGrpT       cshLimGrp       [EXT_INQ_MEMB_INFO_CSH_REC_MAX];
} extInqMembInfoResponseT, *pExtInqMembInfoResponseT;

#endif  /* _EXT_INQ_MEMB_INFO_RESPONSE_T_ */

/******************************************************************************/

#ifndef _INQ_MEMB_INFO_RESPONSE_T_
#define _INQ_MEMB_INFO_RESPONSE_T_

typedef struct inqMembInfoResponseTag
{
    dataHeaderT      header;
    bscInqMembInfoResponseT basic;
    extInqMembInfoResponseT extension;
} inqMembInfoResponseT, *pInqMembInfoResponseT;

#endif  /* _INQ_MEMB_INFO_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQMEMBINFO_HXX_ */

/******************************************************************************/
/* End of file InqMembInfo.hxx */
/******************************************************************************/
