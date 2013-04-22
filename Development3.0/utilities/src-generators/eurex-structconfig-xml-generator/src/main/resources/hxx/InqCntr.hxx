/* Generated by Xgen from: E120.07.02 SIR 123667 on: 2009-02-16 10:26 */
/*******************************************************************************
* 2009 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqCntr.hxx
*
*  DESCRIPTION: Layouts used for
*               Inquire Contract
*
*******************************************************************************/

#ifndef _INQCNTR_HXX_
#define _INQCNTR_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define FUT_BSC_INQ_CNTR_REC_MAX                 219
#define OPT_BSC_INQ_CNTR_REC_MAX                 171

/******************************************************************************/

#ifndef _FUT_BSC_INQ_CNTR_REQUEST_T_
#define _FUT_BSC_INQ_CNTR_REQUEST_T_

typedef struct futBscInqCntrRequestTag
{
    futCntrIdGrpT    futCntrIdGrp;
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
} futBscInqCntrRequestT, *pFutBscInqCntrRequestT;

#endif  /* _FUT_BSC_INQ_CNTR_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_INQ_CNTR_REQUEST_T_
#define _FUT_INQ_CNTR_REQUEST_T_

typedef struct futInqCntrRequestTag
{
    dataHeaderT      header;
    futBscInqCntrRequestT basic;
} futInqCntrRequestT, *pFutInqCntrRequestT;

#endif  /* _FUT_INQ_CNTR_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_INQ_CNTR_REC_T_
#define _FUT_BSC_INQ_CNTR_REC_T_

typedef struct futBscInqCntrRecTag
{
    futCntrIdGrpT    futCntrIdGrp;
    char             currTypCod      [CURR_TYP_COD_LEN];
    char             dcmlShft;
    char             trdUntNo        [TRD_UNT_NO_LEN];
    char             cntrExpDat      [DRIV_DATE_LEN];
    char             primExchIdCod   [PRIM_EXCH_ID_COD_LEN];
    char             cntrStsCod;
    char             cntrAsynInd;
} futBscInqCntrRecT, *pFutBscInqCntrRecT;

#endif  /* _FUT_BSC_INQ_CNTR_REC_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_INQ_CNTR_RESPONSE_T_
#define _FUT_BSC_INQ_CNTR_RESPONSE_T_

typedef struct futBscInqCntrResponseTag
{
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    futBscInqCntrRecT futBscInqCntrRec [FUT_BSC_INQ_CNTR_REC_MAX];
} futBscInqCntrResponseT, *pFutBscInqCntrResponseT;

#endif  /* _FUT_BSC_INQ_CNTR_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_INQ_CNTR_RESPONSE_T_
#define _FUT_INQ_CNTR_RESPONSE_T_

typedef struct futInqCntrResponseTag
{
    dataHeaderT      header;
    futBscInqCntrResponseT basic;
} futInqCntrResponseT, *pFutInqCntrResponseT;

#endif  /* _FUT_INQ_CNTR_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_INQ_CNTR_REQUEST_T_
#define _OPT_BSC_INQ_CNTR_REQUEST_T_

typedef struct optBscInqCntrRequestTag
{
    optCntrIdGrpT    optCntrIdGrp;
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
} optBscInqCntrRequestT, *pOptBscInqCntrRequestT;

#endif  /* _OPT_BSC_INQ_CNTR_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_INQ_CNTR_REQUEST_T_
#define _OPT_INQ_CNTR_REQUEST_T_

typedef struct optInqCntrRequestTag
{
    dataHeaderT      header;
    optBscInqCntrRequestT basic;
} optInqCntrRequestT, *pOptInqCntrRequestT;

#endif  /* _OPT_INQ_CNTR_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_INQ_CNTR_REC_T_
#define _OPT_BSC_INQ_CNTR_REC_T_

typedef struct optBscInqCntrRecTag
{
    optCntrIdGrpT    optCntrIdGrp;
    char             currTypCod      [CURR_TYP_COD_LEN];
    char             dcmlShft;
    char             trdUntNo        [TRD_UNT_NO_LEN];
    char             cntrExpDat      [DRIV_DATE_LEN];
    char             cntrGenNo;
    char             primExchIdCod   [PRIM_EXCH_ID_COD_LEN];
    char             cntrStsCod;
    char             cntrAsynInd;
    char             lepoInd;
} optBscInqCntrRecT, *pOptBscInqCntrRecT;

#endif  /* _OPT_BSC_INQ_CNTR_REC_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_INQ_CNTR_RESPONSE_T_
#define _OPT_BSC_INQ_CNTR_RESPONSE_T_

typedef struct optBscInqCntrResponseTag
{
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    optBscInqCntrRecT optBscInqCntrRec [OPT_BSC_INQ_CNTR_REC_MAX];
} optBscInqCntrResponseT, *pOptBscInqCntrResponseT;

#endif  /* _OPT_BSC_INQ_CNTR_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_INQ_CNTR_RESPONSE_T_
#define _OPT_INQ_CNTR_RESPONSE_T_

typedef struct optInqCntrResponseTag
{
    dataHeaderT      header;
    optBscInqCntrResponseT basic;
} optInqCntrResponseT, *pOptInqCntrResponseT;

#endif  /* _OPT_INQ_CNTR_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQCNTR_HXX_ */

/******************************************************************************/
/* End of file InqCntr.hxx */
/******************************************************************************/