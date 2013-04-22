/* Generated by Xgen from: E100.00.01 SIR 68471 on: 2006-11-23 09:55 */
/*******************************************************************************
* 2006 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   EntVolTrd.hxx
*
*  DESCRIPTION: Layouts used for
*               Enter Vola Trade
*
*******************************************************************************/

#ifndef _ENTVOLTRD_HXX_
#define _ENTVOLTRD_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _FUT_BSC_ENT_VOL_TRD_REQUEST_T_
#define _FUT_BSC_ENT_VOL_TRD_REQUEST_T_

typedef struct futBscEntVolTrdRequestTag
{
    char             buyCod;
    futCntrIdGrpT    futCntrIdGrp;
    trdrIdGrpT       trdrIdGrp;
    char             trdXQty         [DRIV_VOLUME_LEN];
    char             trdMtchPrc      [DRIV_PRICE_LEN];
    char             opnClsCod;
    char             membCtpyIdCod   [MEMB_CTPY_ID_COD_LEN];
} futBscEntVolTrdRequestT, *pFutBscEntVolTrdRequestT;

#endif  /* _FUT_BSC_ENT_VOL_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_EXT_ENT_VOL_TRD_REQUEST_T_
#define _FUT_EXT_ENT_VOL_TRD_REQUEST_T_

typedef struct futExtEntVolTrdRequestTag
{
    acctTypCodGrpT   acctTypCodGrp;
    txtGrpT          txtGrp;
    char             membClgIdCod    [MEMB_CLG_ID_COD_LEN];
    char             trnIdNoOpt      [TRN_ID_NO_LEN];
    char             usedQtyOpt      [DRIV_VOLUME_LEN];
} futExtEntVolTrdRequestT, *pFutExtEntVolTrdRequestT;

#endif  /* _FUT_EXT_ENT_VOL_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_ENT_VOL_TRD_REQUEST_T_
#define _FUT_ENT_VOL_TRD_REQUEST_T_

typedef struct futEntVolTrdRequestTag
{
    dataHeaderT      header;
    futBscEntVolTrdRequestT basic;
    futExtEntVolTrdRequestT extension;
} futEntVolTrdRequestT, *pFutEntVolTrdRequestT;

#endif  /* _FUT_ENT_VOL_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_ENT_VOL_TRD_RESPONSE_T_
#define _FUT_BSC_ENT_VOL_TRD_RESPONSE_T_

typedef struct futBscEntVolTrdResponseTag
{
    char             trnIdNo         [TRN_ID_NO_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} futBscEntVolTrdResponseT, *pFutBscEntVolTrdResponseT;

#endif  /* _FUT_BSC_ENT_VOL_TRD_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_ENT_VOL_TRD_RESPONSE_T_
#define _FUT_ENT_VOL_TRD_RESPONSE_T_

typedef struct futEntVolTrdResponseTag
{
    dataHeaderT      header;
    futBscEntVolTrdResponseT basic;
} futEntVolTrdResponseT, *pFutEntVolTrdResponseT;

#endif  /* _FUT_ENT_VOL_TRD_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _ENTVOLTRD_HXX_ */

/******************************************************************************/
/* End of file EntVolTrd.hxx */
/******************************************************************************/
