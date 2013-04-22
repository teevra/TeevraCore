/* Generated by Xgen from: E110.03.08 SIR 103290 on: 2008-04-02 14:05 */
/*******************************************************************************
* 2008 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   EntMembStopRlse.hxx
*
*  DESCRIPTION: Layouts used for
*               Enter Member Stop/Release
*
*******************************************************************************/

#ifndef _ENTMEMBSTOPRLSE_HXX_
#define _ENTMEMBSTOPRLSE_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _BSC_ENT_MEMB_STOP_RLSE_REQUEST_T_
#define _BSC_ENT_MEMB_STOP_RLSE_REQUEST_T_

typedef struct bscEntMembStopRlseRequestTag
{
    char             membExchIdCod   [MEMB_EXCH_ID_COD_LEN];
    char             membStopRlseInd;
    trdrIdGrpT       trdrIdGrp;
    char             password        [DRIV_LOGIN_MAX_PWDID];
    trdrIdGrpApprT   trdrIdGrpAppr;
} bscEntMembStopRlseRequestT, *pBscEntMembStopRlseRequestT;

#endif  /* _BSC_ENT_MEMB_STOP_RLSE_REQUEST_T_ */

/******************************************************************************/

#ifndef _ENT_MEMB_STOP_RLSE_REQUEST_T_
#define _ENT_MEMB_STOP_RLSE_REQUEST_T_

typedef struct entMembStopRlseRequestTag
{
    dataHeaderT      header;
    bscEntMembStopRlseRequestT basic;
} entMembStopRlseRequestT, *pEntMembStopRlseRequestT;

#endif  /* _ENT_MEMB_STOP_RLSE_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_ENT_MEMB_STOP_RLSE_RESPONSE_T_
#define _BSC_ENT_MEMB_STOP_RLSE_RESPONSE_T_

typedef struct bscEntMembStopRlseResponseTag
{
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} bscEntMembStopRlseResponseT, *pBscEntMembStopRlseResponseT;

#endif  /* _BSC_ENT_MEMB_STOP_RLSE_RESPONSE_T_ */

/******************************************************************************/

#ifndef _ENT_MEMB_STOP_RLSE_RESPONSE_T_
#define _ENT_MEMB_STOP_RLSE_RESPONSE_T_

typedef struct entMembStopRlseResponseTag
{
    dataHeaderT      header;
    bscEntMembStopRlseResponseT basic;
} entMembStopRlseResponseT, *pEntMembStopRlseResponseT;

#endif  /* _ENT_MEMB_STOP_RLSE_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _ENTMEMBSTOPRLSE_HXX_ */

/******************************************************************************/
/* End of file EntMembStopRlse.hxx */
/******************************************************************************/
