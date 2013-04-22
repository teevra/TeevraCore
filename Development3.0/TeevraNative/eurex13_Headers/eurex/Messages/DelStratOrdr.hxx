/* Generated by Xgen from: E100.04.19 SIR 79062 on: 2007-05-15 09:20 */
/*******************************************************************************
* 2007 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   DelStratOrdr.hxx
*
*  DESCRIPTION: Layouts used for
*               Delete Strategy Order
*
*******************************************************************************/

#ifndef _DELSTRATORDR_HXX_
#define _DELSTRATORDR_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _BSC_DEL_STRAT_ORDR_REQUEST_T_
#define _BSC_DEL_STRAT_ORDR_REQUEST_T_

typedef struct bscDelStratOrdrRequestTag
{
    char             buyCod;
    stratIdGrpT      stratIdGrp;
    trdrIdGrpT       trdrIdGrp;
    char             ordrNo          [DRIV_ORDR_NO_LEN];
    char             userOrdrRef     [USER_ORDR_REF_LEN];
} bscDelStratOrdrRequestT, *pBscDelStratOrdrRequestT;

#endif  /* _BSC_DEL_STRAT_ORDR_REQUEST_T_ */

/******************************************************************************/

#ifndef _DEL_STRAT_ORDR_REQUEST_T_
#define _DEL_STRAT_ORDR_REQUEST_T_

typedef struct delStratOrdrRequestTag
{
    dataHeaderT      header;
    bscDelStratOrdrRequestT basic;
} delStratOrdrRequestT, *pDelStratOrdrRequestT;

#endif  /* _DEL_STRAT_ORDR_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_DEL_STRAT_ORDR_RESPONSE_T_
#define _BSC_DEL_STRAT_ORDR_RESPONSE_T_

typedef struct bscDelStratOrdrResponseTag
{
    char             ordrQty         [DRIV_VOLUME_LEN];
    char             lstEvntDat      [DRIV_DATE_LEN];
    char             lstEvntTim      [DRIV_TIME_LEN];
    char             lstEvntTrnId    [LST_EVNT_TRN_ID_LEN];
} bscDelStratOrdrResponseT, *pBscDelStratOrdrResponseT;

#endif  /* _BSC_DEL_STRAT_ORDR_RESPONSE_T_ */

/******************************************************************************/

#ifndef _DEL_STRAT_ORDR_RESPONSE_T_
#define _DEL_STRAT_ORDR_RESPONSE_T_

typedef struct delStratOrdrResponseTag
{
    dataHeaderT      header;
    bscDelStratOrdrResponseT basic;
} delStratOrdrResponseT, *pDelStratOrdrResponseT;

#endif  /* _DEL_STRAT_ORDR_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _DELSTRATORDR_HXX_ */

/******************************************************************************/
/* End of file DelStratOrdr.hxx */
/******************************************************************************/
