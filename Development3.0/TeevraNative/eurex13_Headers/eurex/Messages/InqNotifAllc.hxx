/* Generated by Xgen from: E60_baseline on: 2002-02-12 17:59 */
/*******************************************************************************
* 2002 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqNotifAllc.hxx
*
*  DESCRIPTION: see documentation
*
*******************************************************************************/

#ifndef _INQNOTIFALLC_HXX_
#define _INQNOTIFALLC_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

#define FUT_BSC_INQ_NOTIF_ALLC_GRP_MAX	232
#define FUT_BSC_INQ_NOTIF_ALLC_REC_MAX	17
#define FUT_EXT_INQ_NOTIF_ALLC_REC_MAX	17

/******************************************************************************/

#ifndef _FUT_BSC_INQ_NOTIF_ALLC_REQUEST_T_
#define _FUT_BSC_INQ_NOTIF_ALLC_REQUEST_T_

typedef struct futBscInqNotifAllcRequestTag
{
  futCntrIdGrpT futCntrIdGrp[FUT_BSC_INQ_NOTIF_ALLC_GRP_MAX];
  char mliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN];
  char keyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN];
} futBscInqNotifAllcRequestT, *pFutBscInqNotifAllcRequestT;


#endif  /* _FUT_BSC_INQ_NOTIF_ALLC_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_INQ_NOTIF_ALLC_REQUEST_T_
#define _FUT_INQ_NOTIF_ALLC_REQUEST_T_

typedef struct futInqNotifAllcRequestTag
{
  dataHeaderT header;
  futBscInqNotifAllcRequestT basic;
} futInqNotifAllcRequestT, *pFutInqNotifAllcRequestT;


#endif  /* _FUT_INQ_NOTIF_ALLC_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_INQ_NOTIF_ALLC_REC_T_
#define _FUT_BSC_INQ_NOTIF_ALLC_REC_T_

typedef struct futBscInqNotifAllcRecTag
{
  futCntrIdGrpT futCntrIdGrp;
  char isinCod[ISIN_COD_LEN];
  char notifQty[DRIV_QUANTITY_LEN];
  char allcQty[DRIV_QUANTITY_LEN];
  char faceAmnt[DRIV_AMOUNT_LEN];
  char invcAmnt[DRIV_AMOUNT_LEN];
} futBscInqNotifAllcRecT, *pFutBscInqNotifAllcRecT;


#endif  /* _FUT_BSC_INQ_NOTIF_ALLC_REC_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_INQ_NOTIF_ALLC_RESPONSE_T_
#define _FUT_BSC_INQ_NOTIF_ALLC_RESPONSE_T_

typedef struct futBscInqNotifAllcResponseTag
{
  char keyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN];
  char mliRecCtr[DRIV_MLI_REC_CTR_LEN];
  futBscInqNotifAllcRecT futBscInqNotifAllcRec[FUT_BSC_INQ_NOTIF_ALLC_REC_MAX];
} futBscInqNotifAllcResponseT, *pFutBscInqNotifAllcResponseT;


#endif  /* _FUT_BSC_INQ_NOTIF_ALLC_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_EXT_INQ_NOTIF_ALLC_REC_T_
#define _FUT_EXT_INQ_NOTIF_ALLC_REC_T_

typedef struct futExtInqNotifAllcRecTag
{
  char prodShtNam[PROD_SHT_NAM_LEN];
} futExtInqNotifAllcRecT, *pFutExtInqNotifAllcRecT;


#endif  /* _FUT_EXT_INQ_NOTIF_ALLC_REC_T_ */

/******************************************************************************/

#ifndef _FUT_EXT_INQ_NOTIF_ALLC_RESPONSE_T_
#define _FUT_EXT_INQ_NOTIF_ALLC_RESPONSE_T_

typedef struct futExtInqNotifAllcResponseTag
{
  futExtInqNotifAllcRecT futExtInqNotifAllcRec[FUT_EXT_INQ_NOTIF_ALLC_REC_MAX];
} futExtInqNotifAllcResponseT, *pFutExtInqNotifAllcResponseT;


#endif  /* _FUT_EXT_INQ_NOTIF_ALLC_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_INQ_NOTIF_ALLC_RESPONSE_T_
#define _FUT_INQ_NOTIF_ALLC_RESPONSE_T_

typedef struct futInqNotifAllcResponseTag
{
  dataHeaderT header;
  futBscInqNotifAllcResponseT basic;
  futExtInqNotifAllcResponseT extension;
} futInqNotifAllcResponseT, *pFutInqNotifAllcResponseT;


#endif  /* _FUT_INQ_NOTIF_ALLC_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQNOTIFALLC_HXX_ */

/******************************************************************************/
/* End of file InqNotifAllc.hxx */
/******************************************************************************/
