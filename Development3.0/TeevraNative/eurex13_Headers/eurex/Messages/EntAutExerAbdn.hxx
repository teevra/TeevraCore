/* Generated by Xgen from: E120.07.02 SIR 123667 on: 2009-02-16 10:26 */
/*******************************************************************************
* 2009 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   EntAutExerAbdn.hxx
*
*  DESCRIPTION: Layouts used for
*               Enter Automatic Exercise Abandon
*
*******************************************************************************/

#ifndef _ENTAUTEXERABDN_HXX_
#define _ENTAUTEXERABDN_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _OPT_BSC_ENT_AUT_EXER_ABDN_REQUEST_T_
#define _OPT_BSC_ENT_AUT_EXER_ABDN_REQUEST_T_

typedef struct optBscEntAutExerAbdnRequestTag
{
    char             membClgIdCod    [MEMB_CLG_ID_COD_LEN];
    char             membExchIdCod   [MEMB_EXCH_ID_COD_LEN];
    acctTypCodGrpT   acctTypCodGrp;
    optCntrIdGrpT    optCntrIdGrp;
} optBscEntAutExerAbdnRequestT, *pOptBscEntAutExerAbdnRequestT;

#endif  /* _OPT_BSC_ENT_AUT_EXER_ABDN_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_EXT_ENT_AUT_EXER_ABDN_REQUEST_T_
#define _OPT_EXT_ENT_AUT_EXER_ABDN_REQUEST_T_

typedef struct optExtEntAutExerAbdnRequestTag
{
    char             abdnQtyAdj      [DRIV_QUANTITY_LEN];
    char             password        [DRIV_LOGIN_MAX_PWDID];
    trdrIdGrpApprT   trdrIdGrpAppr;
} optExtEntAutExerAbdnRequestT, *pOptExtEntAutExerAbdnRequestT;

#endif  /* _OPT_EXT_ENT_AUT_EXER_ABDN_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_ENT_AUT_EXER_ABDN_REQUEST_T_
#define _OPT_ENT_AUT_EXER_ABDN_REQUEST_T_

typedef struct optEntAutExerAbdnRequestTag
{
    dataHeaderT      header;
    optBscEntAutExerAbdnRequestT basic;
    optExtEntAutExerAbdnRequestT extension;
} optEntAutExerAbdnRequestT, *pOptEntAutExerAbdnRequestT;

#endif  /* _OPT_ENT_AUT_EXER_ABDN_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_EXT_ENT_AUT_EXER_ABDN_RESPONSE_T_
#define _OPT_EXT_ENT_AUT_EXER_ABDN_RESPONSE_T_

typedef struct optExtEntAutExerAbdnResponseTag
{
    char             abdnQty         [DRIV_QUANTITY_LEN];
} optExtEntAutExerAbdnResponseT, *pOptExtEntAutExerAbdnResponseT;

#endif  /* _OPT_EXT_ENT_AUT_EXER_ABDN_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_ENT_AUT_EXER_ABDN_RESPONSE_T_
#define _OPT_ENT_AUT_EXER_ABDN_RESPONSE_T_

typedef struct optEntAutExerAbdnResponseTag
{
    dataHeaderT      header;
    optExtEntAutExerAbdnResponseT extension;
} optEntAutExerAbdnResponseT, *pOptEntAutExerAbdnResponseT;

#endif  /* _OPT_ENT_AUT_EXER_ABDN_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _ENTAUTEXERABDN_HXX_ */

/******************************************************************************/
/* End of file EntAutExerAbdn.hxx */
/******************************************************************************/
