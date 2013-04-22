/* Generated by Xgen from: E100.04.19 SIR 79062 on: 2007-05-15 09:20 */
/*******************************************************************************
* 2007 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   EntStratQuo.hxx
*
*  DESCRIPTION: Layouts used for
*               Enter Strategy Quote
*
*******************************************************************************/

#ifndef _ENTSTRATQUO_HXX_
#define _ENTSTRATQUO_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _BSC_ENT_STRAT_QUO_REQUEST_T_
#define _BSC_ENT_STRAT_QUO_REQUEST_T_

typedef struct bscEntStratQuoRequestTag
{
    stratIdGrpT      stratIdGrp;
    trdrIdGrpT       trdrIdGrp;
    char             quoExePrcBuy    [DRIV_PRICE_LEN];
    char             quoExePrcSel    [DRIV_PRICE_LEN];
    char             quoQtyBuy       [DRIV_VOLUME_LEN];
    char             quoQtySel       [DRIV_VOLUME_LEN];
} bscEntStratQuoRequestT, *pBscEntStratQuoRequestT;

#endif  /* _BSC_ENT_STRAT_QUO_REQUEST_T_ */

/******************************************************************************/

#ifndef _EXT_ENT_STRAT_QUO_REQUEST_T_
#define _EXT_ENT_STRAT_QUO_REQUEST_T_

typedef struct extEntStratQuoRequestTag
{
    acctTypCodGrpT   acctTypCodGrp;
    char             prcRsblChkInd;
} extEntStratQuoRequestT, *pExtEntStratQuoRequestT;

#endif  /* _EXT_ENT_STRAT_QUO_REQUEST_T_ */

/******************************************************************************/

#ifndef _ENT_STRAT_QUO_REQUEST_T_
#define _ENT_STRAT_QUO_REQUEST_T_

typedef struct entStratQuoRequestTag
{
    dataHeaderT      header;
    bscEntStratQuoRequestT basic;
    extEntStratQuoRequestT extension;
} entStratQuoRequestT, *pEntStratQuoRequestT;

#endif  /* _ENT_STRAT_QUO_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_ENT_STRAT_QUO_RESPONSE_T_
#define _BSC_ENT_STRAT_QUO_RESPONSE_T_

typedef struct bscEntStratQuoResponseTag
{
    char             ordrNoBuy       [DRIV_ORDR_NO_LEN];
    char             ordrNoSel       [DRIV_ORDR_NO_LEN];
    char             quoBkQtyBuy     [DRIV_VOLUME_LEN];
    char             quoBkQtySel     [DRIV_VOLUME_LEN];
    char             quoExeQtyBuy    [DRIV_VOLUME_LEN];
    char             quoExeQtySel    [DRIV_VOLUME_LEN];
    char             lstEvntDat      [DRIV_DATE_LEN];
    char             lstEvntTim      [DRIV_TIME_LEN];
    char             lstEvntTrnId    [LST_EVNT_TRN_ID_LEN];
} bscEntStratQuoResponseT, *pBscEntStratQuoResponseT;

#endif  /* _BSC_ENT_STRAT_QUO_RESPONSE_T_ */

/******************************************************************************/

#ifndef _ENT_STRAT_QUO_RESPONSE_T_
#define _ENT_STRAT_QUO_RESPONSE_T_

typedef struct entStratQuoResponseTag
{
    dataHeaderT      header;
    bscEntStratQuoResponseT basic;
} entStratQuoResponseT, *pEntStratQuoResponseT;

#endif  /* _ENT_STRAT_QUO_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _ENTSTRATQUO_HXX_ */

/******************************************************************************/
/* End of file EntStratQuo.hxx */
/******************************************************************************/
